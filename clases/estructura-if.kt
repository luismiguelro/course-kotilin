fun main(args: Array<String>) {
  val nombre = "Luis Miguel"

  //isNotEmpty(): validar que el campo no este vacio
  if(nombre.isNotEmpty()){
    println("El largo de nuestra variable nombre es de       ${nombre.length}")
  } else{
        println("Variable vacia")
  }
  /*en una sola linea
    if(nombre.isNotEmpty()) println("El largo de nuestra variable nombre es de ${nombre.length}") else println("Variable vacia")*/

    // inmutable
// asiganar if a una variable
val message = if(nombre.equals("Joe")) "Hello $nombre" else "I don't Know you" println(message)
}

