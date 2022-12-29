fun main() {
    val a1 = 100 + 200
    println("a1 : $a1")

    val num1 = 100   // 객체
    val num2 = 200  // 객체
    println(num1 + num2)    // 객체 + 객체

    val a2 = num1.plus(num2)
    println("a2: $a2")

    val obj1 = TestClass5(100, 200)
    val obj2 = TestClass5(1000, 2000)

    val obj3 = obj1 + obj2
    println("obj3.a1: ${obj3.a1}")
    println("obj3.a2: ${obj3.a2}")

    val obj4 = obj1 - obj2
    println("obj4.a1: ${obj4.a1}")
    println("obj4.a2: ${obj4.a2}")
}

class TestClass5(var a1: Int, var a2: Int) {
    operator fun plus(target: TestClass5): TestClass5 {
        val r1 = this.a1 + target.a1
        val r2 = this.a2 + target.a2
        return TestClass5(r1, r2)
    }

    operator fun minus(target: TestClass5): TestClass5 {
        val r1 = this.a1 - target.a1
        val r2 = this.a2 - target.a2
        return TestClass5(r1, r2)
    }
}