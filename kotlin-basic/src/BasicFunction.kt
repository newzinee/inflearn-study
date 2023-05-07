fun main() {

    test1()
    test2(10, 11.1)
    test2(a2 = 2.2, a1 = 1)
    test3(a2 = "hi")
    test4()
//    test5()
}

fun test1() {
    println("test1 호출")
}

fun test2(a1: Int, a2: Double) {
    println("test2 호출")
    println("a1 = $a1")
    println("a2 = $a2")
}

fun test3(a1: Int = 1, a2: String) {
    println("test3 호출")
    println("a1: $a1")
    println("a2: $a2")
}

fun test4() {
    println("test4")
    fun test5() {
        println("test5")
    }
    test5()
}