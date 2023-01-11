//FUNCIONES DE EXTENSION
  
  //FOR :  Ejecutar codigo para cada elemento de una lista


  //listOf(): Estructura de datos que no puede ser modificada
  val listaFrutas = listOf("manzana","pera","frambuesa","durazno")

  //recorrer la lista
  for(fruta in listaFrutas){
    println("hoy voy a comerme una fruta llamada $fruta")
  }

  //ahorrar lineas 
    for(fruta in listaFrutas) println("hoy voy a comerme   una fruta llamada $fruta")

    // foreach
    listaFrutas.forEach { fruta -> println("hoy voy a comerme   una fruta nueva llamada $fruta")}

    //map : Funciones poderosas en Kotlin, convertir lista de frutas directamente a enteros que contenga el tamaño de caracteres

    //List<Int>: lista de tipo entero

    val caracterFruta: List<Int> = listaFrutas.map { fruta -> fruta.length }
    println(caracterFruta)

    //Filter : Filtrar según una condición

    val listaFiltrada = caracterFruta.filter {largoFruta -> largoFruta>5}
    println(listaFiltrada)