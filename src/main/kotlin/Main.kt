val name = "Shreerama"
fun ConditinalStatement() {
      //immutabe variable
    var Age :Int? = null    //null mutable variable
    Age = 21
//    if (Age != null ) {
//        println(name)
//    }else{
//        println(name+ " " + "Age")
//    }

//    When Statement
    when (Age){
        null -> println("my name is " + name )
        else -> println("my name is " + name + " and my age is " + Age )
    }
    val toPrintAge = if (Age != null)Age else "NDA"
    println(toPrintAge)


}
//JAVA == void : KOTLIN == Unit or can use without writing anything


//return null type
fun nullReturn() : String? {
    return null
}

fun getGreeting(): String {
    return  "Namste"
}

//Single Expression Function
fun KtFun() = "Kotlin is fun"


fun main(args: Array<String>) {
    println("Hello World!")
    println(getGreeting())
    ConditinalStatement()
    println(nullReturn())
    println(KtFun())

}
