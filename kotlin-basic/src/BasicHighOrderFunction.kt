fun main() {
    val t1 = fun(x1: Int, x2: Int): Int {
        return x1 + x2
    }

    testFunc1(t1, 100, 200)

    testFunc1(fun(x1: Int, x2: Int): Int {
        return x1 - x2
    }, 100, 200)

    val lambda1 = { x1: Int, x2: Int -> x1 * x2 }
    testFunc1(lambda1, 100, 200)

    testFunc1({ x1: Int, x2: Int -> x1 / x2 }, 200, 100)

    val t2 = testFunc22()
    val r2 = t2(100, 200)
    println("r2: $r2")

    val t3 = testFunc33()
    val r3 = t3(100, 200)
    println("r3: $r3")

    testFunc4({ x1: Int -> x1 + 100 }, 200)
    testFunc4({ it + 100 }, 200)  // 매개변수를 하나만 받는다면 it 을 명시해서 바로 쓸 수 있음

    // 함수를 매개변수로 받는 고차함수를 쓸 때, 함수인 매개변수를 마지막 변수로 쓴다면 두번째처럼 빼서 쓸 수 있음.
    testFunc5(100, 200, { x1: Int, x2: Int -> x1 + x2 })
    testFunc5(100, 200) { x1: Int, x2: Int ->
        x1 + x2
    }

    testFunc6({ x1: Int -> println(x1) })
    testFunc6 { println(it) }
}

fun testFunc1(m1: (Int, Int) -> Int, a1: Int, a2: Int) {
    val r1 = m1(a1, a2)
    println("r1: $r1")
}

fun testFunc22(): (Int, Int) -> Int {
    return fun(x1: Int, x2: Int): Int {
        return x1 + x2
    }
}

fun testFunc33(): (Int, Int) -> Int {
    return { x1: Int, x2: Int -> x1 - x2 }
}

fun testFunc4(m1: (Int) -> Int, a1: Int) {
    val r4 = m1(a1)
    println("r4: $r4")
}

fun testFunc5(a1: Int, a2: Int, m1: (Int, Int) -> Int) {
    val r5 = m1(a1, a2)
    println("r5: $r5")
}

fun testFunc6(m1: (Int) -> Unit) {
    m1(100)
}