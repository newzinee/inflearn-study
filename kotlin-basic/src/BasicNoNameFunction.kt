fun main() {
    testFunction1()

//    val testFunction2 = testFunction1 // error

    val testFunction2 = fun() {
        println("testFunction2")
    }
    println("testFunction2 = ${testFunction2}")
    testFunction2()
}

fun testFunction1() {
    println("testFunction1")
}