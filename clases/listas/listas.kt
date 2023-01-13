fun main(args: Array<String>) {
//Lista inmutable: no se elimina o se agregan elementos
  val listaDeNombre = listOf("Juan","Pedro","Nony")

  println(listaDeNombre);

// Lista Mutable
  val listaVacia = mutableListOf<String>()
  println(listaVacia)

  //agregar elemento
  listaVacia.add("Pablo")
  println(listaVacia)

  //Obtener valor
  val valUsandoGet = listaVacia.get(0)
  println(valUsandoGet)

  //Obtener con []
  val valUsandoOperador = listaVacia[0]
  println(valUsandoOperador)

  //Obtener valor con: .first()
  val primerValor = listaDeNombre.first();
  println(primerValor)

  //.firstOrNull: en caso de que la lista este vacia, devuelve string

  /*Eliminar
  listaVacia.removeAt(0)
  println(listaVacia)*/

  //Eliminar segun una condicion
  listaVacia.removeIf {caracteres -> caracteres.length>3}
  println(listaVacia)

  //ARRAYS: Kotlin los adecua segun la necesidad, codigo performace
  val myArray = arrayOf(1,2,3,4)
  println(myArray)

  //Convertir array a una lista
  println("MY ARRAY ${myArray.toList()}")
}