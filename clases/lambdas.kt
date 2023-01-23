fun main(args: Array<String>) {
  /*Funciones que no se declaran sino que se pasan inmediatamente como una expresion*/

  //Declaración
  val myLambda : (String) ->  Int ={it.length}

  val lambdaEjecutada: Int = myLambda("MigueLucho")
  //Imprimir
  println(lambdaEjecutada)
  /*10*/

  val saludos = listOf("Hola","Ciao")
    val longitudSaludos = saludos.map(myLambda)
    println(longitudSaludos)
    /*[4,4]*/

}