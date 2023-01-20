fun main(args: Array<String>) {
  
  val fraseAleatoria ="En Platzi nunca se para de aprender <3"
  println(randomCase(fraseAleatoria))
  /*EN PLATZI NUNCA SE PARA DE APRENDER <3*/
}
fun randomCase (frase : String) : String{
  val numeroAleatorio = 0..99
  val resultadoAleatorio = numeroAleatorio.random()
  return if(resultadoAleatorio.rem(2)==0){
     frase.toUpperCase()
  } else{
    return frase.toLowerCase()
  }
}