//Declarando valores de las respuestas
const val AFFIRMATIVE_ANSWER = "✅"
const val NEGATIVE_ANSWER = "❌"
const val DOUBTFUL_ANSWER = "?"

//uniendo las respuestas con sus valores
val answers = mapOf(
    "Yes" to AFFIRMATIVE_ANSWER,
    "It's true" to AFFIRMATIVE_ANSWER,
    "Totally" to AFFIRMATIVE_ANSWER,
    "Undoubtedly" to AFFIRMATIVE_ANSWER,
    "Ask in an other moment" to DOUBTFUL_ANSWER,
    "I can't say you in this moment" to DOUBTFUL_ANSWER,
    "Maybe yes, or maybe not" to DOUBTFUL_ANSWER,
    "It's not going to happen" to NEGATIVE_ANSWER,
    "Do not count on it" to NEGATIVE_ANSWER,
    "Definitely not" to NEGATIVE_ANSWER,
    "I don't believe it" to NEGATIVE_ANSWER
)


fun main(args: Array<String>) {
    //Declarando el menu principal
    println("Hello, I'm the Kotlin 8 Ball. What do you want to do?\n" +
            "1. Ask a question\n" +
            "2. Check all answers\n" +
            "3. Exit")
    //leyendo la respuesta del usuario
    val inputValue = readLine()
    
    //funciones a executar segun la respuesta del usuario
    when(inputValue){
        "1"->askQuestion()
        "2"->checkAnswer()
        "3"->exit()
        else->showError()
    }
    
}
