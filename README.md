# Kotlin

This is the Template Repl for Kotlin. 

Kotlin is a statically typed programming language interoperable with Java and Android.

This workspace is the notes and exercises of the [Kotlin Course from Zero in Platzi.](https://platzi.com/cursos/kotlin/)

[Check out the official docs here](https://kotlinlang.org/docs/home.html).
# **Introducción a Kotlin**

## ****Qué es la Java Virtual Machine?****

Una virtual machine es una virtualización o simulación de un sistema operativo o de los procesos que ocurren dentro de este. En nuestro caso, la Java Virtual Machine pertenece al segundo tipo y se encarga de simular los procesos que ocurren dentro de un sistema operativo. A este tipo de máquinas virtuales se les llama Process Virtual Machines.

![kotlin_interoperability_banner-fbb620e4-00e6-46fc-9a48-9a57c9aa1d1a.jpg](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0b8f5b51-53f2-41f6-9a8f-e57f90ac6293/kotlin_interoperability_banner-fbb620e4-00e6-46fc-9a48-9a57c9aa1d1a.jpg)

La similitud entre ambos lenguajes, hacen que kotlin sea la nueva actualización de java, uno de los códigos base en la programación de multiplataforma, kotlin nace como la alternativa o como un hijo de todo lo aprendido por java.

Kotlin potencializa el código, ayudándolo a simplificar una sintaxis algo robusta y rígida en la programación con java.

Mejora la compilación y los tiempos de respuesta en la virtualización del su código fuente.

### ¿Cómo funciona la JVM?

Nosotros ingresamos código de Kotlin y se transforma en Bytecode. Este proceso puede ocurrir con otros lenguajes como Java, esto hace que nuestro código de Kotlin pueda ser utilizado desde Java y el código de Java pueda ser utilizado en Kotlin.

## Qupe es Kotlin?

Kotlin es un lenguaje de programación estático de código abierto que admite la programación funcional y orientada a objetos. Proporciona una sintaxis y conceptos similares a los de otros lenguajes, como C#, Java y Scala, entre muchos otros. No pretende ser único, sino que se inspira en décadas de desarrollo del lenguaje. Cuenta con variantes que se orientan a la JVM (Kotlin/JVM), JavaScript (Kotlin/JS) y el código nativo (Kotlin/Native)

**Kotlin** cuenta con varias características como lo son:

- Expresivo y conciso.
- Código mas seguro al ayudarte a evitar excepciones del tipo NullPointerExceptions.
- 100% interoperable, lo que te permitirá implementar Kotlin en tus proyectos en la medida que quieras.

**Kotlin se puede usar en:**

- **Backend** con frameworks como Spring
- De **forma nativa** en Windows
- **Scripts** que pueden ser ejecutados en cualquier entorno
- **Multiplataforma** lo cuál permite la logica de negocio entre Android e iOS

![kotlin-1b0fb630-bb0c-4109-869a-3cf448c7ea68.jpg](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bd5a825b-93e5-401e-a699-dfb5eb140c17/kotlin-1b0fb630-bb0c-4109-869a-3cf448c7ea68.jpg)

## Hola, Mundo desde Kotlin

Los programas en kotlin empiezan con una funcion principal, esta función es el punto de entrada de nuestras aplicaciones, siempre que necesitemos que un programa tenga vida necesitamos crear o tener dicha funcion (fun main).

![tipos-de-datos-kotlin-1-762831eb-ae25-47df-8f5f-2321f8f1f386.jpg](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0e53ce4d-286b-43b5-870c-d4bf9b1ef6d3/tipos-de-datos-kotlin-1-762831eb-ae25-47df-8f5f-2321f8f1f386.jpg)

- Explicación
    - fun main ----> la funcion principal
    - (args: Array<String>) ---> parametros de la función
    - {} ----> dentro de las llaves se encuentra en codigo que se ejecutará en nuestra aplicación.
    - print("Hola Mundo") ----> con esta funcion podremos codigo por pantalla.
    - println("Hola Mundo") ----> es lo mismo que print pero con esta podremos hacer salto de lineas.

## Variables

- VAR = el valor puede cambiarse
- VAL = Una vez asignado el valor no puede volver a cambiarse
- CONST VAL = se definen fuera de la función de forma reservada “const val” y se utilizan para valores que no deben cambiar nunca

## ****Kotlin y sus tipos de variables****

- Boolean: true & false
- Long: Cantidad excesiva de números 3L(declarar como long)
- Double : valor punto flotante: 2.7182
- Float: Indicar porcentaje

Puede inicializar `Double`y `Float`variables con números que tienen una parte fraccionaria. Está separado de la parte entera por un punto ( `.`) Para variables inicializadas con números fraccionarios, el compilador infiere el `Double`tipo:

`val pi = 3.14 // Double
// val one: Double = 1 // Error: type mismatch
val oneDouble = 1.0 // Double`

- REPASO: Tipos de dato en JAVA
    
    ## Primitivos
    
    |  |
    | --- |
    | Tipo |
    | byte |
    | short |
    | int |
    | long |
    | float |
    | double |
    | chart |
    
    Tabla tomada de: [https://www.abrirllave.com/java/tipos-de-datos-primitivos.php](https://www.abrirllave.com/java/tipos-de-datos-primitivos.php)
    
    ## De objeto
    
    - **Tipos de la biblioteca estándar de Java**: String, Scanner, ArrayList, etc.
    - **Tipos definidos por el programador**: Cliente, Estudiante, Carro, etc.
    - **arrays**: elementos tipo vector o matriz.
    - **Tipos envoltorio o wrapper**: Byte, Short, Integer, Long, Float, Double, Character, Boolean.

En Kotlin , todas las variables son un objeto

Propiedad Kotlin: Template

[https://replit.com/@LuisMiguelRguez/course-kotilin#main.kt](https://replit.com/@LuisMiguelRguez/course-kotilin#main.kt)

## ****Modificadores y tipos de datos en Kotlin****

### ¿Que es un tipo de dato?

Enteros, cadenas de texto, booleanos. El tipo de valor que van a tener nuestras variabkes

### **¿Qué es un dato primitivo**

Tipos de datos originales de un lenguaje de programación. En Kotlin lo son los enteros, booleanos y cadenas de texto

### **¿Qué es un objeto?**

Es una combinación de variables, funciones y otros objetos.

**En Kotlin todo es un objeto**, se convierten los datos primitivos a un objeto para obtener algunas ventajas como:

- Crear funciones especificas para el objeto que ayuden a no reescribir el código.
- Sobrescribir operadores como la suma o multiplicación.
- Extender el lenguaje para crear nuevas funciones que permitan repetir código0
- Kotlin tiene que compilar el cósigo y hacerlo interopeable con JAVA
    - Un entero que puede ser nulo, pero no se convertirá a primitivo
    - Un entero que no puede ser nulo, se convertirá en a primitivo
        
        ![T9M2J-fe8c185f-d1d9-4ecd-b66f-31e40fed42e4.jpg](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5872cdcf-6ada-4006-b6c3-abff83a4a492/T9M2J-fe8c185f-d1d9-4ecd-b66f-31e40fed42e4.jpg)
        
        ## Operaciones con tipos de datos
        
        [****Operaciones con los tipos de datos en Kotlin****](https://www.notion.so/Operaciones-con-los-tipos-de-datos-en-Kotlin-b3a59bd20736456b80ccb5b254dbabfc)
        
        ## ****Kotlin y la programación funciona****
        
        **Paradigma de programación funcional**
        
        - Se centra en que tiene que hacer un programa y no en como se hace.
        - *Características de Kotlin **
        
        **Paradigma imperativo:**
        
        - Se centra en describir como funciona un programa.
        
        Programación Funcional.
        
        ![https://static.platzi.com/media/user_upload/840_560-9893b148-f57a-4fe5-bea4-1fc3e4ca0a3c.jpg](https://static.platzi.com/media/user_upload/840_560-9893b148-f57a-4fe5-bea4-1fc3e4ca0a3c.jpg)
        
        **Mientras que los programas imperativos tienden a proporcionar los pasos a dar por un programa, los funcionales tienden a enfatizar la composición y disposición de las funciones, sin especificar pasos de manera explícita.**
        
        ![1_gC-mtCSPHG1mRC1UcT_hVw.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/40c7d86e-596c-4e51-ba1e-6abd93ed2ee1/1_gC-mtCSPHG1mRC1UcT_hVw.png)
        
        ## Es****tructuras de control: if****
        
        [https://replit.com/@LuisMiguelRguez/course-kotilin#clases/estructura-if.kt](https://replit.com/@LuisMiguelRguez/course-kotilin#clases/estructura-if.kt)
        
        Para las personas que vengan de Java, los operadores ternarios tales como se conocen en java no existen en Kotlin, sin embargo, se puede utilizar un if de una sóla línea, por ejemplo:
        
        ```kotlin
        //Java approach
        
        String nombre = "Joe";
        String message = nombre.equals("Joe") ? "Hello " + nombre : "I don't Know you";
        
        //Kotlin approach
        var nombre = "Joe"
        var message = if(nombre.equals("Joe")) "Hello $nombre" else "I don't Know you"
        ```
        
        ## ****Estructuras de Control: when****
        
        - Esta sentencia sirve en los casos que tengamos que comparar nuestra variable con múltiples opciones, ya que con la sentencia IF puede resultar poco optimo.
        - When también se puede tilizar sin parametro y usarlo como condiciones if-else.
        - Posee la misma lógica del SWITCH-CASE en muchos lenguajes de programacion
        
        [https://replit.com/@LuisMiguelRguez/course-kotilin#clases/estructura-when.kt](https://replit.com/@LuisMiguelRguez/course-kotilin#clases/estructura-when.kt)
        
        # **Conceptos básicos de Kotlin**
        
        ## ****Bucles: While y Do While****
        
        ![r3ulhb9a1o421-dc638314-7d8b-408a-9817-3f4659135285.jpg](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e0438c70-68b9-4310-8b71-16c899e7e74e/r3ulhb9a1o421-dc638314-7d8b-408a-9817-3f4659135285.jpg)
        
        [https://replit.com/@LuisMiguelRguez/course-kotilin#clases/while-dowhile.kt](https://replit.com/@LuisMiguelRguez/course-kotilin#clases/while-dowhile.kt)
        
        ## ****Ciclos****
        
        [https://replit.com/@LuisMiguelRguez/course-kotilin#clases/ciclos.kt](https://replit.com/@LuisMiguelRguez/course-kotilin#clases/ciclos.kt)
        

## Null-Safety en Kotlin

[****KOTLIN, GESTION DE NULOS (NULL SAFETY)****](https://www.notion.so/KOTLIN-GESTION-DE-NULOS-NULL-SAFETY-1371c219c7aa47c0b2a41a9885765a22)

## ****Valores nulos, Double bang y cómo solucionarlos.****

Nullables: incluyen null dentro de ellos

Declarar

```kotlin
var segundoNombre:String? = "Antonio"
```

**Compilador es tu amigo, no tu enemigo**

- Interpreta estos tipos
- Utilizar lenguaje, para sacar provecho al compilador
- Pensar en equipo de trabajo

**Crea código para todos**

- Pensar solucion a futuro
- Crear mejor código

**Boy Scout**

- Deja siempre el código mejor de lo que lo encontraste

Safe Calls

- Herramienta de Kotlin, que ayudan a ejecutar un código cuando no sea null

```kotlin
println(segundoNombre?.lenght)
```

Double bang

- Indicación: ❗️❗️
- En este punto la variable no puede ser nula

Gran poder, gran responsabilidad

- Mala práctica
- No usar solo para que el código compile y ya
- Usarlo solo en caso necesario

Interoperabilidad con Java

- Integer❗️, no puede ser verificado con kotlin
    - Aviso de que no puede asegurarse de que el código no devuelva null
- Convertir nulleable

no se debe de abusar de los manejos de errores.

Puede sonar controversial pero comparto el siguiente enlace:[https://elizarov.medium.com/kotlin-and-exceptions-8062f589d07](https://elizarov.medium.com/kotlin-and-exceptions-8062f589d07)

## Listas

Mutables: Es decir, las que se pueden editar

Inmutables:  Las que son solo de lectura

[https://replit.com/@LuisMiguelRguez/course-kotilin#clases/listas.kt](Código de la clase)

Recuerden!

- Las listas son inmutables, si queremos agregar, remover o usar funciones mas avanzadas necesitaremos una mutableList.
- Podemos tener valores duplicados en una lista
- Podemos recorrer todos los elementos de una lista
- La principal diferencia entre una lista y un array es que la lista no puede actualizar ninguna de las referencias que almacena.

## ****Como ordenar listas con las funciones que tiene Kotlin****
[https://replit.com/@LuisMiguelRguez/course-kotilin#clases/listas/funciones-lista.kt]

## Maps

Maps:  

- Ordenar elementos
    - Clave: tiene un valor y es de un mismo tipo
    - Valor: puede pertenecer a varias claves

Antes de buscar como hacer algo manualmente, preguntarnos si existe una funcion que lo hace

[https://replit.com/@LuisMiguelRguez/course-kotilin#clases/maps.kt]

## Set


Sets:
Kotlin set es una colección desordenada de elementos. Un conjunto Kotlin puede ser mutable (mutableSetOf) o de sólo lectura (setOf). Los conjuntos mutables o inmutables de Kotlin no permiten tener elementos duplicados.

[Sets En Kotlin - Develou](https://www.develou.com/sets-en-kotlin/)

[https://replit.com/@LuisMiguelRguez/course-kotilin#clases/sets.kt](https://replit.com/@LuisMiguelRguez/course-kotilin#clases/sets.kt)

## ¿Qué son las funciones?

Una función es un código que se ejecuta cada vez que lo llamamos.

**Sintaxis de una función**

Las funciones más básicas se componen de 4 partes.

- Palabra reservada fun.
- Nombre de la función.
- Parámetros: Son las variables que le damos a la función para que las use en el código que ejecuta internamente.
- Tipo de retorno: Puede tener o no un valor de retorno.
- Código: Son las instrucciones que se van a ejecutar al llamar a la función.

Ejemplo de función:

![https://static.platzi.com/media/user_upload/ejemplo-funcion-c53ba9d2-3278-47e4-91c7-85894fb98cc5.jpg](https://static.platzi.com/media/user_upload/ejemplo-funcion-c53ba9d2-3278-47e4-91c7-85894fb98cc5.jpg)

Cuando queremos devolver algo de nuestra función usamos la keyword **return**.Caso contrario cuando no queremos devolver nada de nuestra función, Kotlin regresaría **Unit**.

Ejemplo de función que no devuelve nada, no tiene ningún tipo de retorno.

![https://static.platzi.com/media/user_upload/funcion%20sin%20retorno-f8b5644b-410b-48ca-927c-43c66a1a4971.jpg](https://static.platzi.com/media/user_upload/funcion%20sin%20retorno-f8b5644b-410b-48ca-927c-43c66a1a4971.jpg)

[https://replit.com/@LuisMiguelRguez/course-kotilin#clases/funcion.kt](https://replit.com/@LuisMiguelRguez/course-kotilin#clases/funcion.kt)

**Funciones de extension**

- Extiende funcionalidades de una clase
- tiene un nuevo parámetro : recibidor

Se declara tal que asi

```kotlin
fun String.randomCase() :String {
	val numeroAleatorio = 0..99
	  val resultadoAleatorio = numeroAleatorio.random()
	  return if(resultadoAleatorio.rem(2)==0){
	     this.toUpperCase()
	  } else{
	    return this.toLowerCase()
	  }
}
```

En otras palabras, una funcion de extensión es una función que puede ser llamada como miembro de una clase, pero esta definida por fuera de ella.

## ****Tipos de parámetros en las funciones****

Dependiendo de la función que queramos, se pueden crear distintos tipos de parametros: nombrados o por defecto

```kotlin
imprimirNombre("Luis", "Rodriguez")
  /*Mi nombre es: Luis y mi apellido es Rodriguez*/

  printWholeName("","Miguel", "Rodriguez")
  /*My name is  Miguel Rodriguez*/
}
fun imprimirNombre(nombre: String, apellido: String){
  println("Mi nombre es: $nombre y mi apellido es $apellido")
}

/*imprimir en caso de que el segundo nombre este vacio*/
fun printWholeName(firstName: String, secondName: String = "", surName: String) {
    println("My name is $firstName ${if (secondName.isNotEmpty()) "$secondName " else ""}$surName")
```

[https://replit.com/@LuisMiguelRguez/course-kotilin#clases/tipoparametro.kt](https://replit.com/@LuisMiguelRguez/course-kotilin#clases/tipoparametro.kt)

## ****Lambdas****

Una función lambda es un literal de función que puede ser usado como expresión. Esto quiere decir, una función que no está ligada a un identificador y que puedes usar como valor.

La sintaxis de un literal lambda va al interior de dos llaves {}. Sus componentes son:

![https://www.develou.com/wp-content/uploads/2021/01/sintaxis-de-lambda-en-kotlin.png](https://www.develou.com/wp-content/uploads/2021/01/sintaxis-de-lambda-en-kotlin.png)

- Lista de parámetros: Cada parámetro es una declaración de variable, aunque esta lista es opcional
- Operador de flecha ->:Se omite si no usas lista de parámetros
- Cuerpo del lambda: Son las sentencias que van luego del operador de flecha
- Sintaxis De Expresiones Lambda En KotlinLa anterior sintaxis de la imagen se puede leer como «para cada par de s y t corresponde el valor 2*(s+t)
	
```kotlin
	fun main(args: Array<String>) {
  /*Funciones que no se declaran sino que se pasan inmediatamente como una expresion*/

  //Declaración
  val myLambda : (String) ->  Int ={it.length}

  val lambdaEjecutada: Int = myLambda("MigueLucho")
  //Imprimir
  println(lambdaEjecutada)
  /*10*/

  val saludos = listOf("Hola","Ciao")
    val longitudSaludos = saludos.map(myLambda)
    println(longitudSaludos)
    /*[4,4]*/

}
```

[https://replit.com/@LuisMiguelRguez/course-kotilin#clases/lambdas.kt](https://replit.com/@LuisMiguelRguez/course-kotilin#clases/lambdas.kt)

# Scope Functions

## Let

Es una función que crea un alcance temporal para un objeto en el interior de un bloque de código.

Esto quiere decir, que puedes referirte al objeto sin usar su nombre debido a que es el parámetro de la función lambda pasada a let.

```kotlin
fun main(args: Array<String>){

    //Let ejecuta código cuando el valor no es nulo
    var nombre: String? = null
    nombre?.let{
        //Código no se ejecutara al ser la variable nula
        valor -> println("El nombre no es nulo es $valor")
    }

    nombre = "David"
    nombre?.let{
        //Código  se ejecutara
        valor -> println("El nombre no es nulo, es $valor")
    }
}
```

## With

Nos ayuda a acceder directamente a las propiedades de la variable o a la misma variable utilizando this.

```kotlin
fun main() {
    val numeros = listOf(3, 1, 5, 2, 10)

/* Se tiene acceso directo al scope de los número con with, 
así ya no necesitamos escribir el nombre de la variable*/
    with(numeros) {
        println("Estos  son los numeros $this")
        println("Este es el primer elemento: ${first()}")
        println("Esta es la lista ordenada: ${sorted()}")
        println("Y esta es la lista mezclada aleatoriamente: ${shuffled()}")
    }
}
```

## Run

**La Función run()**

`run` hace parte de las [funciones de alcance](https://kotlinlang.org/docs/reference/scope-functions.html#run) que Kotlin te provee para mejorar la legibilidad y hacer más conciso tu código.

Al igual que la [función let](https://www.develou.com/la-funcion-let-en-kotlin/), toma una [función lambda](https://www.develou.com/lambdas-en-kotlin/) como parámetro, ejecuta sus sentencias y retorna como resultado el valor computado desde `R`.

```
inline fun <T, R> T.run(block: T.() -> R): R
```

La única diferencia es que el parámetro `block` es un [tipo función con recibidor](https://www.develou.com/lambdas-con-recibidor-en-kotlin/), por lo que debes usar la expresión `this` para referirte al objeto recibidor.

```
fun main() {
    val resultado = "Ejemplo".run {
        println("El String \"$this\" tiene $length caracteres")
        length
    }
}
```

En el ejemplo anterior podemos usar `this` para referirnos al contenido del String y acceder directamente a `length`, ya que el objeto recibidor de la lambda es el contexto del alcance en el bloque de código.

Ejemplo:

```kotlin
fun main(args: Array<String>){
    val moviles = mutableListOf("Samsung A50","Samsung A51","Samsung A52")
            .run{
                removeIf{ movil->movil.contains("A50") }
                this
            }
    println(moviles)
}
```

## Apply

```kotlin

fun main(args: Array<String>) {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3").apply{
            removeIf{movil -> movil.contains("Google")}
    }
    println(moviles)

    val colores : MutableList<String>? = mutableListOf("Amarillo", "Azul", "Rojo")
    colores?.apply {
        println("Nuestros colores son $this")
        println("La cantidad de colores es $size")
    }
}
```

```kotlin
fun main(args: Array<String>) {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3").apply{
            removeIf{movil -> movil.contains("Google")}
    }
    println(moviles)

    val colores : MutableList<String>? = mutableListOf("Amarillo", "Azul", "Rojo")
    colores?.apply {
        println("Nuestros colores son $this")
        println("La cantidad de colores es $size")
    }
}
```

## Apply

```kotlin
// also -> Allow us to obtain a variable then execute a code with that variable an return it to be use
    val appleDevices = mutableListOf("Apple Watch", "iMac", "iPhone", "HomePod", "Airpods", "iPad", "iPod", "MacBook")
        .also { list -> println("the original value of the list is $list") }
        .asReversed()
    println(appleDevices)
```
