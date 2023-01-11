fun main(args: Array<String>) {
  val nombreColor = "Carmesi

  when(nombreColor){
    "Amarillo" -> println("Amarillo, color de la alegría")
    /*llegando al caso de tener misma respuesta para varios casos
    separar por comas (,)*/
    "Rojo", "Carmesi" -> println("Roojo simboliza el calor")
    else -> println("no hay informacion del color")
  }
  val code = 200
  when(code){
    // encontrar un rango
    in 200..299 -> println("Todo ha ido bien")
    in 400..500 -> println("Algo ha fallado")
    else -> println ("Desconocido")
  }
  val tallaDeZapatos = 41
  val mensaje =  when (tallaDeZapatos){
    41,43 -> println("Disponible")
    42,44 -> println("Quedan pocos")
    45 -> println("No disponible")
    else -> println("Solo hay tallas 41,42,43,44 y 45 ")
  }
}