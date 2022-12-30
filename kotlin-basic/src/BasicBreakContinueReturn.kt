fun main() {

    val r1 = testFun1(100)
    println("r1: $r1")

    var r2 = testFun2(0)
    println("r2: $r2")

    var r3 = testFun3(0)
    println("r3: $r3")

    println("----------")
    for (item in 1..10) {
        if (item > 5) {
            break
        }
        println("$item")
    }
    println("----------")
    for (item in 1..10) {
        if (item % 2 == 0) {
            continue
        }
        println("$item")
    }
}

fun testFun1(a: Int) : Int {
    println("testFun1")
    return a + 100
}

fun testFun2(a: Int) :Int {
    println("testFunc2")

    if (a == 0) {
        return -1
    }

    return 100 / a
}

fun testFun3(a: Int) {
    if (a == 0) {
        return
    }
    println("testFun3: $a")
}