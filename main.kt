fun main(args: Array<String>) {
//Lista inmutable
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

  
}