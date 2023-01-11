fun main(args: Array<String>) {
  //WHILE
  var contador =10
  // mientras contador >0 ejecuta
  while(contador>0){
    println("El valor del contador es $contador")
    contador--
  }

    //DO WHILE
  do{
    println("Generando numero aleatorio");
    //generar valor aleatorio entre: 0 y 100
    val numAleatorio = (0..100).random();
    println("El numero generado es $numAleatorio");
    
  }while(numAleatorio>50);
}