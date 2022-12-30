fun main() {

    val testFun1 = testFun1(100, 200)
    println("testFun1: $testFun1")

    val testFun2 = testFun2(100, 200)
    println("testFun2: $testFun2")

    val testFun3 = testFun3(100, 200)
    println("testFun3 = ${testFun3}")

    val lambda1: (Int, Int) -> Int = { a1: Int, a2: Int -> a1 + a2 }
    println("lambda1 = ${lambda1(100, 200)}")

    val lambda2 = { a1: Int, a2: Int -> a1 + a2 }  // type 추론 가능하면 생략 가능
    println("lambda2 = ${lambda2(100, 200)}")

    val lambda3: (Int, Int) -> Int = { a1, a2 -> a1 + a2 }
    println("lambda3 = ${lambda3(100, 200)}")

    val testFun4 = testFun4(100, 200)
    println("testFun4 = ${testFun4}")

    val lambda4 = { a1: Int, a2: Int ->
        val r1 = a1 + a2
        val r2 = a1 - a2
        r1 * r2
    }
    println("lambda4 = ${lambda4(100, 200)}")
}

fun testFun1(a1: Int, a2: Int): Int {
    return a1 + a2
}

fun testFun2(a1: Int, a2: Int): Int = a1 + a2  // return 1줄

fun testFun3(a1: Int, a2: Int) = a1 + a2  // return type 유추 가능해서 생략 가능

fun testFun4(a1: Int, a2: Int): Int {
    val r1 = a1 + a2
    val r2 = a1 - a2
    val r3 = r1 * r2
    return r3
}