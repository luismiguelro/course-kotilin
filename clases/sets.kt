fun main(args: Array<String>) {
  //Sets: no permite valores repetidos

  //inmutables
  val vocalesRepetidas = setOf("a","e","i","o","u","a","e","i","o","u")
  println (vocalesRepetidas) /*[a, e, i, o, u]*/

  //mutable
  val numerosFavoritos = mutableSetOf(1,2,3,4)
  numerosFavoritos.add(5)
  numerosFavoritos.add(5)

  println(numerosFavoritos) /*[1,2,3,4,5]*/
  
  //Eliminar
  numerosFavoritos.remove(2) 
  println(numerosFavoritos) /*[1,3,4,5]*/

  //Obtener un elemento utilizando(toma el primero)
  val valorDelSet = numerosFavoritos.firstOrNull{numero -> numero>2}
  println(valorDelSet) /*3*/
   
  //Convertir una lista a set
    val list = listOf(1,2,3,3)
    val sett = list.toSet()
    val listFromSet = sett.toList()
    val elementoDeList = listFromSet
    println(elementoDeList)/*[1, 2, 3]*/
}