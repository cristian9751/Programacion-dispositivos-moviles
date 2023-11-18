package com.cristian.dragonballcristian.Characters

// data class que permite obtener un List con todos los personajes
//  Esta data class simula el acceso a una API o base de datos para obtener la información
data class Character(
    var id: Int,
    var japaneseName: String,
    var spanishName: String,
    var otherName: String,
    var birthdayYear: Int,
    var gender: String,
    var species: String,
    var photo: String,
    var information: String,
) {
    companion object{
        // Variable que almacenará la lista de personajes.
        // Es mutable list porque hay una función que le añade elementos y otra que ordenará su contenido
        var charactersList: MutableList<Character> = ArrayList()

        // Función que crea todos los objetos Character y los añade a la MutableList
        //  En este punto es donde se podría hacer la conexión a la API o base de datos
        fun getCharacters(): List<Character> {
            charactersList.clear()
            charactersList.add(Character(1, "そんごくう", "Son Goku", "Kakarot", 736, "masculino", "saiyan", "https://static.wikia.nocookie.net/dragonball/images/f/f1/Goku_DBZ_Fin.png/revision/latest?cb=20171130202437&path-prefix=es", "Originalmente enviado a la Tierra como un infante volador con la misión de conquistarla. Sin embargo, el caer por un barranco le proporcionó un brutal golpe que si bien casi lo mata, este alteró su memoria y anuló todos los instintos violentos de su especie, lo que lo hizo crecer con un corazón puro y bondadoso, pero conservando todos los poderes de su raza. No obstante, en la nueva continuidad de Dragon Ball se establece que él fue enviado por sus padres a la Tierra con el objetivo de sobrevivir a toda costa a la destrucción de su planeta por parte de Freeza. Más tarde, Kakarot, ahora conocido como Son Goku, se convertiría en el príncipe consorte del monte Fry-pan y líder de los Guerreros Z, así como el mayor defensor de la Tierra y del Universo 7, logrando mantenerlos a salvo de la destrucción en innumerables ocasiones, a pesar de no considerarse a sí mismo como un héroe o salvador."))
            charactersList.add(Character(2, "クリリン", "Krilin ", "Kurilín", 736, "masculino", "humano", "https://static.wikia.nocookie.net/dragonball/images/4/41/Krilin_Universo7.png/revision/latest?cb=20170705064045&path-prefix=es", "Es un artista marcial de baja estatura y que lleva la cabeza rapada por su entrenamiento como monje en el templo de Oorin y seis puntos tatuados en su frente (más tarde la mayoría quedarían ocultos al dejar crecer su cabello). Sin embargo su principal rasgo físico es que carece de nariz. En su juventud su inseguridad le afectaba negativamente en los combates, lo que al comienzo lo llevaba a mentir y tratar de engañar a Gokū y a su maestro durante los entrenamientos, pero Krilin posee un gran potencial como luchador. Entre sus numerosas hazañas podemos contar el buen papel que hizo al participar en las 21.ª y 23º ediciones del Torneo de las artes marciales, llegando a semifinales en las dos primeras ediciones y a cuartos de final en la tercera, además de defender al planeta Tierra de los saiyanes."))
            charactersList.add(Character(3, "ヤムチャ", "Yamcha", "", 733, "masculino", "humano", "https://static.wikia.nocookie.net/dragonball/images/b/b0/Yamcha_%28Cell%29.png/revision/latest?cb=20201224190500&path-prefix=es", "Sse ganaba la vida como asaltante de caminos al lado de su amigo Puar. Cuando era un bandido del desierto se encontró con Son Gokū y Bulma, en su primer encuentro casi vence a Gokū, pero cuando vio a Bulma salió huyendo antes de robarles. Mientras los seguía y planeaba un nuevo ataque escuchó sobre las Dragon Balls, intento arrebatárselas pero esta vez fue vencido fácilmente por Gokū, quien ya no estaba con hambre, botándole un diente con una patada. Decide unirse al grupo para robarles las Dragon Balls cuando las juntaran pero terminó haciendo amistad con ellos, e incluso venció su miedo a las mujeres y empezó una relación con Bulma."))
            charactersList.add(Character(4, "ブルマ", "Bulma", "Dra. Bulma", 733, "femenino", "humano", "https://static.wikia.nocookie.net/dragonball/images/b/b9/Bulma_DB_Artwork_Inicio.png/revision/latest?cb=20170709213656&path-prefix=es", "Va en busca de las Dragon Balls para pedir su deseo (al principio quería un novio), va provista de todo tipo de vehículos y artefactos tecnológicos sumamente útiles. Aunque carece de habilidad para el combate, su inteligencia es muy superior a un ser humano normal, siendo la creadora de muchos inventos, como por ejemplo el Radar que indica con precisión la ubicación de las Dragon Balls."))
            charactersList.add(Character(5, "てん しんはん", "Ten Shinhan", "Shinto ", 736, "masculino", "humano", "https://static.wikia.nocookie.net/dragonball/images/4/4c/Tenshinhan_%28Cell%29.png/revision/latest?cb=20210117204214&path-prefix=es", "Ten Shin Han originalmente es un alumno del maestro Tsuru Sen'nin, quien es un antiguo compañero y luego enemigo del maestro Kame Sen'nin (ambos fueron alumnos del fallecido Mutaito). Siempre va acompañado de Chaoz, su compañero inseparable y también alumno de Tsuru Sen'nin. Ten Shin Han estaba adiestrado en el denominado estilo de la Grulla, muy fuerte y cruel, tal como se vio en el combate contra Yamcha, a quien le rompió una pierna sin ningún escrúpulo cuando ya había ganado el combate. En la final contra Son Gokū perdió el combate pero ganó de forma fortuita de acuerdo a las reglas del torneo (según las cuales el primero en tocar una superficie fuera del cuadrilátero resulta perdedor) ya que, en los últimos instantes de la pelea, al haber salido despedidos fuera del área del estadio y estar en caída libre tanto él (inconsciente tras recibir un ataque) como Gokū (por no tener más energía), es el último en tocar el suelo ya que su rival fue chocado por un auto en el último tramo de la caída, por lo que la aceleró en los últimos segundos e hizo que toque el suelo primero, resultando así campeón Ten Shin Han."))
            charactersList.add(Character(6, "ピッコロ", "Piccolo", "Piccolo Jr.", 753, "asexuado", "namekiano", "https://static.wikia.nocookie.net/dragonball/images/5/55/Piccolo_DBS_Broly_dise%C3%B1o.png/revision/latest?cb=20180819213535&path-prefix=es", "Heredero del legado de su padre, se puede llegar a considerar una prolongación de la existencia de este. Desde su nacimiento, su primer objetivo, fue hacerse lo bastante fuerte para vengarse de Goku. Tras tres años de crecimiento acelerado y duros entrenamientos, Piccolo participó en el 23 Torneo de las Artes de Marciales bajo el nombre de Mao Junior con la intención de matar a Goku. Tras eliminar a Krilin en los cuartos de final, tuvo que enfrentarse a Kami Sama, a quien encerró con una reversión al Mafuba."))
            charactersList.add(Character(7, "かめせんにん", "Kame-Sen'nin", "Maestro tortuga", 430, "masculino", "humano", "https://static.wikia.nocookie.net/dragonball/images/8/83/Roshi_Pafu_Pafu_Render.png/revision/latest/scale-to-width-down/1000?cb=20160610183544&path-prefix=es", "Es discípulo del Maestro Mutaito, su dominio de las artes marciales y un agua extraña que tomó años atrás le ha permitido una longevidad sin límites. Es uno de los humanos más poderosos durante y se preocupa de que sus alumnos orienten sus técnicas para el bien. Vive en la Kame House. Es el creador de la famosa técnica de combate Kame Hame Ha. Quienes le conocen, le califican de viejo verde, debido a su afición a las revistas de modelos de bikinis, es un hombre extremadamente pervertido y atrevido."))
            charactersList.add(Character(8, "カリン", "Karin", "Duende Karin", 50, "masculino", "gato", "https://static.wikia.nocookie.net/dragonball/images/1/1f/Karin_en_Super_Hero.png/revision/latest?cb=20211227234812&path-prefix=es", "Es un enigmático maestro de artes marciales que vive en lo alto de la torre del mismo nombre. Quien logre subir la torre podrá entrenar con él para conseguir el Chōseisui o Agua Sagrada. También sirve de intermediario a todo aquel que quiere entrenar con Kamisama, que primero debe pasar un par de pruebas y ganar su consentimiento. Él y la persona que las pase y logre el favor del Maestro Karin/Matou con éxito subirán hacia donde se encuentra Kamisama a recibir su entrenamiento."))
            charactersList.add(Character(9, "そんごはん", "Son Gohan", "Gran Saiyaman", 757, "masculino", "saiyan-humano", "https://static.wikia.nocookie.net/dragonball/images/4/4b/Gohan_Cell_Artwork.png/revision/latest?cb=20160802185828&path-prefix=es", "Es el primer hijo de Son Gokū y Chi-Chi, hermano mayor de Son Goten, esposo de Videl, con quien tiene una hija llamada Pan. Es mitad Saiyajin y mitad humano. En su niñez fue entrenado por Piccolo para poder enfrentarse a los Saiyan Vegeta y Nappa. Derrotó a Cell en la batalla final del torneo organizado por este último. En el futuro se convirtió en el maestro de Trunks con el que se enfrenta a los androides perdiendo un brazo en una de las batallas."))
            charactersList.add(Character(10, "トランクス", "Trunks ", "Trunks del futuro", 766, "masculino", "saiyan-humano", "https://static.wikia.nocookie.net/dragonball/images/4/4b/Trunks_del_Futuro_DBZ_Render.png/revision/latest?cb=20171129051437&path-prefix=es", " Es el hijo de Bulma y Vegeta. En el futuro alternativo es el único saiyan que queda como el héroe de la tierra (y no posee hermanos o hermanas). Logra salvar la Tierra de su línea temporal volviendo al pasado en una máquina del tiempo inventada por su padre, en este viaje del tiempo consigue la transformación a Super Sayayín 2 en su entrenamiento para el torneo organizado por Cell, gracias a la cuál salvará su línea temporal derrotando a los androides."))
            charactersList.add(Character(11, "ベジータ", "Vegeta ", "Príncipe Vegeta", 732, "masculino", "saiyan", "https://static.wikia.nocookie.net/dragonball/images/1/14/Vegeta_en_Super_Hero.png/revision/latest?cb=20220119211034&path-prefix=es", "Es el hijo mayor del rey Vegeta III, así como el príncipe más reciente de la familia real saiyana y uno de los pocos supervivientes tras el genocidio saiyano del planeta Vegeta del Universo 7, a manos de Freeza. Es el eterno rival de Son Goku, hermano mayor de Tarble, el esposo de Bulma, padre de Trunks y Bra y ancestro de Vegeta Jr."))
            charactersList.add(Character(12, "ビーデル", "Videl", "Gran Saiyaman 2", 736, "femenino", "humana", "https://static.wikia.nocookie.net/dragonball/images/7/7c/Videl_Z.png/revision/latest?cb=20160718012657&path-prefix=es", "Hija del gran salvador de la tierra Mr. Satán, es experta en artes marciales como su padre y usa sus habilidades para combatir el crimen en la ciudad." + "Juega un papel importante cuando Gohan se convierte en el justiciero conocido como el Gran Saiyaman, rápidamente ella descubre su identidad y lo chantajea para que le enseñe nuevas técnicas usando su ki. Tras la batalla de Majin Boo contra matrimonio con Son Gohan y tienen una hija llamda Pan."))
            charactersList.add(Character(13, "パン", "Pan", "", 779, "femenino", "humana", "https://static.wikia.nocookie.net/dragonball/images/0/0f/Pan_GT_Artwork.png/revision/latest?cb=20161205172649&path-prefix=es", "Es hija de Son Gohan y Videl, nieta de Son Goku y Chi-chi, y Mr. Satan."))
            charactersList.add(Character(14, "フリーザ", "Freezer", "Freeza", 0, "masculino", "mutante clan Freeza", "https://static.wikia.nocookie.net/dragonball/images/e/e8/Freeza_artwork_Dragon_Ball_Super_Broly_%281%29.png/revision/latest/scale-to-width/360?cb=20200207113941&path-prefix=es", "Proveniente de una raza extraterrestre muy fuerte, puede transformarse en varias formas para esconder su poder de combate y darle uso en situaciones de riesgo. Otra de sus características es que puede permanecer en el espacio exterior, ya que su organismo no requiere oxígeno."))
            charactersList.add(Character(15, "セル", "Cell", "Célula", 786, "intersexuado", "bioandroide", "https://static.wikia.nocookie.net/dragonball/images/1/1e/Cell_Perfecto_Dokkan.png/revision/latest?cb=20210102170513&path-prefix=es", "Fue creado por la computadora del Dr. Gero, quien vino del futuro de la línea 3 con la intención de vengarse de Goku por haber acabado con el ejército de la Red Ribbon, y con ello el sueño de todo villano: dominar el mundo. Está fabricado a partir de células de Goku, Piccolo, Vegeta, Freeza y su padre el Gran Rey Cold. Una minicomputadora en forma de insecto registró los movimientos y técnicas de estos luchadores, haciendo que Cell sepa usar todos sus ataques, y por ende, predecir la mayoría de sus movimientos. Cell puede absorber la energía vital de todo ser viviente con un aguijón al final de la cola, y para alcanzar la perfección de su cuerpo debe absorber a los androides Nº17 y Nº18. Para cumplir su objetivo, en el futuro mató a Trunks y robó su Máquina del tiempo para viajar al pasado."))
            charactersList.add(Character(16, "人造人間17号", "C17", "Lapis", 0, "masculino", "androide", "https://static.wikia.nocookie.net/dragonball/images/6/65/17_Artwork.png/revision/latest?cb=20160806215121&path-prefix=es", "Androide Número 17 conocido como Lapis antes de ser secuestrado, es el hermano mellizo de la Androide Número 18, quien al igual que ella antes de ser Androide era un humano normal hasta que fueron secuestrados por el Dr. Gero, y es por eso que lo odian. Tras su cambio de humano a Androide, le insertaron un chip con el objetivo de destruir a Son Goku."))
            charactersList.add(Character(17, "人造人間18号", "C18", "Lazuli", 0, "femenino", "androide", "https://static.wikia.nocookie.net/dragonball/images/f/fa/Androide_18_Artwork.png/revision/latest?cb=20160823214537&path-prefix=es", "Androide Número 18 conocida como Lazuli cuando era joven, es la hermana melliza del Androide Número 17 y una \"androide\" creada a partir de una base humana por el Dr. Gero con el único fin de destruir a Goku."))
            charactersList.add(Character(18, "魔人ブウ", "Majin-Boo", "Boo", 774, "masculino", "majin", "https://static.wikia.nocookie.net/dragonball/images/3/32/BuuGordo_Universo7.png/revision/latest?cb=20170705061603&path-prefix=es", "Es el resultado del Majin-Boo que realiza la fisión para separarse en dos mitades: una buena y una mala, existiendo como la parte bondadosa de la entidad." + "En la actualidad, tras haber absorbido al Gran Kaio-shin del Universo 7 como Pequeño Boo, esta deidad se convirtió en el lado más dominante en Majin-Boo como Boo Gordo, siendo que el primero aún vive dentro de su organismo a través de su alma."))
            charactersList.add(Character(19, "ランチ", "Lunch", "Marilynn", 732, "femenino", "humana", "https://static.wikia.nocookie.net/dragonball/images/f/fb/Lunch_forma_mala_Artwork.png/revision/latest?cb=20161123000624&path-prefix=es", "Lunch es una chica que sufre de un trastorno de personalidad doble que a raíz de sus reacciones alérgicas provoca que ella cambie entre dos personalidades diferentes cada vez que estornuda, ninguna de las personalidades recuerda lo que la otra hizo o dijo. Es llevada a la Kame House por Son Goku y Krilin como condición del Maestro Roshi para entrenarles. A partir de este momento se une al grupo de Goku."))
            charactersList.add(Character(20, "チチ", "Chi-Chi", "", 737, "femenino", "humana", "https://static.wikia.nocookie.net/dragonball/images/5/5d/Milk_DB_inicio.png/revision/latest?cb=20160723132246&path-prefix=es", "es la princesa del Monte Fry-pan siendo la hija de la fallecida reina de esta montaña y el Rey Gyuma, ella terminaría conociendo a Son Goku cuando era tan solo una niña para años más tarde durante su adolescencia ser su esposa y convertirse en la estricta pero amorosa madre de Gohan y Goten."))
            return charactersList
        }

        // Función que devuelve un List con los Character ordenados por nombre alfabéticamente de menera ascendente
        //  Esta función se usará para obtener todas las letras iniciales de los personajes para el StichyHeader
        //  de la lista de la parte izquierda de la APP
        fun sorted(): List<Character> {
            val characterList = getCharacters()
            charactersList.sortBy {
                it.spanishName
            }
            return characterList
        }

        // Función que devuelve el Character con el id que llega como parámetro.
        //  Esta función se usará para rellenar la parte derecha de la APP con los datos del personaje seleccionado
        fun getCharacterById(id: Int):Character{
            val character = getCharacters().filter { character ->
                character.id == id
            }
            return character[0]
        }

        // Función que devuelve el id del primer elemento de la List de Character
        //  Esta función puede servir para mostrar la información en la parte de la derecha de la APP
        //  de un primer Character al cargar la APP, en la solución que se ha implementado
        //  al cargar la APP en la parte derecha se muestra un mensaje indicando que se seleccione un
        //  personaje de la lista.
        //  Así que no se hará uso de esta función.
        fun getCharacterFirstID():Int{
            return getCharacters()[0].id
        }
    }
}
