fun main(args: Array<String>) {
  //No tienen forma de acceder por un orden espectifico

  //Inmutable
  val edadSuperHeroes = mapOf("IronMan" to 35, "Spiderman" to 23, "Capitan America" to 99)

  println(edadSuperHeroes)
  /*{IronMan=35, Spiderman=23, Capitan America=99}*/

  //Mutable
    val edadSuperHeroesMutable = mutableMapOf("IronMan" to 35, "Spiderman" to 23, "Capitan America" to 99)
     println(edadSuperHeroesMutable)
       /*{IronMan=35, Spiderman=23, Capitan America=99}*/

       //Agregar a la lista

       //put

       edadSuperHeroesMutable.put("Wolverine",45)
       println(edadSuperHeroesMutable) 
              /*{IronMan=35, Spiderman=23, Capitas America=99, Wolverine=45}*/

       //covertir asignación
        edadSuperHeroesMutable["Storm"]=30;
   println(edadSuperHeroesMutable) 
   /*{IronMan=35, Spiderman=23, Capitas America=99, Wolverine=45, Storm=30}*/

   /*Obtener un valor*/
   val edadIroman = edadSuperHeroesMutable["IronMan"]
  println(edadIroman)/*35*/

  /*Eliminar*/
  edadSuperHeroesMutable.remove("Wolverine")
  println(edadSuperHeroesMutable) 

  /*Se puede conocer todas las listas y/o valoress del mapa*/
  
  println(edadSuperHeroesMutable.keys)
  /*[IronMan, Spiderman, Capitan America, Storm*/
  println(edadSuperHeroesMutable.values)
  /*[35, 23, 99, 30]*/
}