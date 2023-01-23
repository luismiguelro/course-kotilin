fun main(args: Array<String>) {

  imprimirNombre("Luis", "Rodriguez")
  /*Mi nombre es: Luis y mi apellido es Rodriguez*/

  printWholeName("","Miguel", "Rodriguez")
  /*My name is  Miguel Rodriguez*/
}
fun imprimirNombre(nombre: String, apellido: String){
  println("Mi nombre es: $nombre y mi apellido es $apellido")
}

/*imprimir en caso de que el segundo nombre este vacio*/
fun printWholeName(firstName: String, secondName: String = "", surName: String) {
    println("My name is $firstName ${if (secondName.isNotEmpty()) "$secondName " else ""}$surName")
}