fun main(args: Array<String>) {
  println("Hello world!")
  val primerValor =20
  val segundoValor = 10
  val tercerValor = primerValor-segundoValor
  // minus = (-)
  println(tercerValor)

  // para concatenar variables con texto
  val nombre = "Luis Miguel"
  val apellido =  "Rodríguez"
  // template o interpolacion: imprimir variables dentro de una cadema de texto
  val nombreCompleto = "Mi nombre es: $nombre $apellido"
  print(nombreCompleto)
}