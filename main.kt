
// Declaramos los valores de nuestras respuestas
const val RESPUESTA_AFIRMATIVA = "✅"
const val RESPUESTA_NEGATIVA = "❌"
const val RESPUESTA_DUDOSA = "\uD83E\uDD14"
var valorIngresado = "";

//Unimos las respuestas con los valores
val respuestas = mapOf(
    "Sí" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA,
)


fun main() {
   menu()
}
fun menu(){
    do{


        // Declarar el mensaje de entrada del programa
        println("Hola soy tu bola 8 magica creada en Kotlin. ¿Cual de estas opciones deseas realizar? ")
        println("1. Realizar una pregunta.")
        println("2. Revisar todas las respuestas.")
        println("0. Salir")

        // Obtener el valor del usuario y convertirlo a un entero nullable
        valorIngresado = readLine().toString()

        // Dependiendo del numero utilizamos el when para realizar una acción.
        when (valorIngresado){
            "1" -> realizarPregunta()
            "2" -> mostrarRespuestas()
            "0" -> salir()
            else -> mostrarError()
        }
    }while(valorIngresado != "0");
}
fun mostrarError() {
    println("Ups... Opción Invalida, elige una opcion nueva¿")
}

fun salir() {
    println("Hasta Luego")
}
fun realizarPreguntaOtraVez(){
    println("¿Deseas realizar otra pregunta?\n Selecciona: \n 1. Si \n 2. No")
    valorIngresado = readLine().toString()
    when(valorIngresado){
        "1" -> menu()
        "2" -> salir()
    }
}
fun realizarPregunta(){
    println ("Que pregunta deseas realizar");
    readLine()
    val respuestaGenerada = respuestas.keys.random()
    println("Así que esa era tu pregunta... La respuesta a eso es... $respuestaGenerada\n")
    realizarPreguntaOtraVez()

}
fun mostrarRespuestas(){
    println ("Selecciona una opción")
    println ("1.Revisar todas las respuestas")
    println ("2.Revisar solo las respuestas afirmativas")
    println ("3.Revisar solo las respuestas dudosas")
    println ("4.Revisar solo las respuestas negativas")
    val opcion=readLine()
    when (opcion){
        "1" -> mostrarRespuestasPorTipo()
        "2" -> mostrarRespuestasPorTipo(RESPUESTA_AFIRMATIVA)
        "3" -> mostrarRespuestasPorTipo(RESPUESTA_NEGATIVA)
        "4" -> mostrarRespuestasPorTipo(RESPUESTA_DUDOSA)
        else -> println ("Respuesta no valida, Adiós")
    }
}
fun mostrarRespuestasPorTipo(tipoDeRespuesta : String = "TODOS") {

    val imprimirRespuestas : (Map<String, String>) -> Unit = { respuestas ->
        respuestas.keys.forEach { respuesta -> println(respuesta) }
    }

    when (tipoDeRespuesta){
        "TODOS" -> imprimirRespuestas(respuestas)
        RESPUESTA_AFIRMATIVA -> respuestas.filterValues { values -> values == RESPUESTA_AFIRMATIVA }
            .also(imprimirRespuestas)
        RESPUESTA_NEGATIVA -> respuestas.filterValues { values -> values == RESPUESTA_NEGATIVA }
            .also(imprimirRespuestas)

        RESPUESTA_DUDOSA -> respuestas.filterValues { values -> values == RESPUESTA_DUDOSA }
            .also(imprimirRespuestas)
    }
    println()
    realizarPreguntaOtraVez()
}

