  /*
  //nullable
  var nombre : String? = null

  //devuelve null y no ejecuta (.length)
  println(nombre?.length)

  // Gestionar errores-exceptions
  try{
    nombre!!.length
  }catch (exception : NullPointerException){
    println("Ha ocurrido un error $exception")
  }

  val primerValor =10
  val segundoValor = 0
  //asignar un resultado a una variables
  val resultado : Int = try{primerValor} catch (e: Execption) {0}
  println(resultado)

  /*Elvis operator ?: 
    Es una versión segura de una expresión if. Devuelve el valor a su izquierda si no es nulo. De lo contrario, devuelve el valor a su derecha*/
*/
  var nombre: String? = null
	var caracteresDeNombre : Int = nombre?.length ?: 0
	println(caracteresDeNombre)

  val m:String? = null
  val c = m?.length ?: -1
        println(c)