package com.cristianpopica.listcristian.ui.Screens

import androidx.annotation.OptIn
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.cristianpopica.listcristian.Model.Movie
import com.cristianpopica.listcristian.ViewModel.MovieViewModel
import com.cristianpopica.listcristian.ui.Navigation.Routes
import kotlinx.coroutines.launch



@kotlin.OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    searchValue: String,
    onValueChange: (String) -> Unit,
    onFavoriteClick: () -> Unit,
    onNameClick: () -> Unit,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                vertical = 20.dp,
                horizontal = 15.dp
            )
    ) {
        OutlinedTextField(
            modifier = Modifier.weight(20f),
            value = searchValue,
            onValueChange = { onValueChange(it) },
            placeholder = { Text(text = "Buscar") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                containerColor = Color.White
            )
        )
        Column(
            modifier = Modifier.weight(2f),
            horizontalAlignment = Alignment.End,
        ) {
            DropDownMenuFilter(
                onFavoriteClick = onFavoriteClick,
                onNameClick = onNameClick
            )
        }
    }
}

@Composable
fun MainScreen(
    navController: NavHostController,
    movieViewModel: MovieViewModel
) {
    val movies : List<Movie> by movieViewModel.movies.observeAsState(initial =  emptyList())
    val isLoadingMovies : Boolean by movieViewModel.isLoading.observeAsState(initial = true)
    var filteredList : List<Movie>  by remember{
        mutableStateOf(emptyList())
    }


    var searchValue by  rememberSaveable {
        mutableStateOf("")
    }

    var scrollState  = rememberLazyListState()
    val corroutineScope = rememberCoroutineScope()
    val isLoading : Boolean by remember {
        derivedStateOf { (filteredList.isEmpty() && searchValue == "") || isLoadingMovies }
    }


    /**
     * Se utiliza para determinar que va a contener filteredList
     */
    LaunchedEffect(searchValue, movies) {
        filteredList = if(searchValue.isNotEmpty() && searchValue.isNotBlank() ) {
            movies.filter {
                it.title.lowercase().contains(searchValue.trim().lowercase())
                        || it.director.lowercase().contains(searchValue.trim().lowercase())
            }
        } else {
            movies
        }
    }
    if(isLoading) {
        Loading()
    } else {
        Column(
            modifier = Modifier.background(MaterialTheme.colorScheme.primary)
        ) {
            SearchBar(
                searchValue = searchValue,
                onValueChange = {searchValue = it},
                onFavoriteClick = {filteredList = filteredList.sortedByDescending { it.favorite } },
                onNameClick = { filteredList = filteredList.sortedBy { it.title }}
            )
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
                    .padding(vertical = 8.dp),
                state = scrollState
            ) {

                if(filteredList.isEmpty()) {
                    item {
                        Text(text = "No se han encontrado resultados")
                    }
                } else {
                    items(filteredList) {movie ->
                        MovieCard(movie = movie, navController = navController , movieViewModel = movieViewModel)
                    }
                }



            }
        }


       Row(
           modifier = Modifier.fillMaxWidth(),
           verticalAlignment = Alignment.Bottom,
           horizontalArrangement = Arrangement.End
       ) {
           if(scrollState.firstVisibleItemIndex > 0) {
               FloatingActionButton(onClick = {
                   corroutineScope.launch {
                       scrollState.scrollToItem(0)
                   }
               }) {
                   Icon(imageVector = Icons.Default.ArrowUpward, contentDescription = "Volver arriba")
               }
       }


    }

}

}
@Composable
fun Loading() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        Text(
            text = "loading ...",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onPrimary
        )
        Spacer(modifier = Modifier.height(20.dp))
        CircularProgressIndicator(
            color = MaterialTheme.colorScheme.onPrimary
        )
    }
}

@Composable
fun DropDownMenuFilter(
    onFavoriteClick: () -> Unit,
    onNameClick: () -> Unit
) {
    var showFilterList by rememberSaveable {
        mutableStateOf(false)
    }

    IconButton(onClick = { showFilterList = true }) {
        Icon(
            imageVector = Icons.Default.FilterList,
            contentDescription = "Filtros"
        )
    }
    DropdownMenu(
        expanded = showFilterList,
        onDismissRequest = { showFilterList = false},
    ) {
        DropdownMenuItem(
            text = { Text(text = "Favoritos") },
            onClick = {
                onFavoriteClick()
                showFilterList = false
            },

            )
        DropdownMenuItem(
            text = { Text(text = "Nombre") },
            onClick = {
                onNameClick()
                showFilterList = false
            }
        )
    }
}

@kotlin.OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieCard(
    movie : Movie,
    navController : NavHostController,
    movieViewModel: MovieViewModel
) {

    OutlinedCard(
        modifier = Modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
            .clickable {
                navController.navigate(Routes.MovieInfo.route)
                movieViewModel.onMovieClicked(movie)
            }
    ) {
        ListItem(
            headlineText = { Text(text = movie.title) },
            supportingText = { Text(text = movie.director)},
            leadingContent = {
                if(movie.favorite) {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "Eliminar favorito",
                    )
                }
            },
            trailingContent = {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Pelicula",
                    modifier = Modifier
                        .clickable {
                            movieViewModel.deleteMovie(movie)
                        }
                )
            }
        )
    }

}