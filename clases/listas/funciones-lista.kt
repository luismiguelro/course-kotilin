fun main(args: Array<String>) {
  val numerosDeLoteria = listOf(11,22,43,56,78,66)

  // ordenar lista ascendente
  val numerosSorted = numerosDeLoteria.sorted();
  println(numerosSorted)  /*[11,22,43,56,66,78]*/

 // ordenar lista automaticamente
 val numerosSortedDes = numerosDeLoteria.sortedDescending();
  println(numerosSortedDes) /*[78/,66,56,43,22,11]*/

  //ordenar lista según una condición
  val ordenarPorMultiplos = numerosDeLoteria.sortedBy{numero-> numero<50}
  println(ordenarPorMultiplos) /*[56, 78, 66, 11, 22, 43]
  Los que cumplan la condición se ubicarán en la posición final, tal como el 43*/

  //ordenar de forma aleatoria
  val numerosAleatorios = numerosDeLoteria.shuffled();
  println(numerosAleatorios) /*[56, 11, 43, 78, 66, 22] ; [56, 11, 22, 78, 66, 43]*/

  //Ordenar lista de atras hacia adelante
  val numerosEnReversa = numerosDeLoteria.reversed()
  println(numerosEnReversa) /*[66, 78, 56, 43, 22, 11]*/

  //Programación Funcional: convertir y filtrar elementos

  //map
  val mensajeNumeros = numerosDeLoteria.map {numero-> "Tú numero de lotería es $numero \n"}
   println(mensajeNumeros)
   /*[Tú numero de lotería es 11, 
   Tú numero de lotería es 22,
   Tú numero de lotería es 43,
   Tú numero de lotería es 56,
   Tú numero de lotería es 78, 
   Tú numero de lotería es 66]*/

   //filter
   val numerosFiltrados = numerosDeLoteria.filter{numero-> numero>50}
   println(numerosFiltrados) /*[56, 78, 66]*/

   /* También podemos encadenar los métodos que nos dan las lista:*/
   val listaDeStringDeNumeros = numerosDeLoteria.filter { num -> num > 50 }.map{num -> "numero: $num"}
   println(listaDeStringDeNumeros)

   /*Lo que nos entrega una lista de Strings de numeros mayores de 50, por si quieren ahorrarse código.
   
  [numero: 56, numero: 78, numero: 66]
  */
   
   
}