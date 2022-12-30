fun main() {
    val obj = TestClass1()
    println("obj: $obj")
    println("===================")
    val obj2 = TestClass1(1)
    println("obj2: ${obj2.v1}")
    println("===================")

    val testClass3 = TestClass3(1)
    println("testClass3.a1 = ${testClass3.a1}")
    println("testClass3.a2 = ${testClass3.a2}")
}

class TestClass1 {

    var v1:Int = 0

    init {
        println("call init")
    }

    constructor() {
        println("call constructor()")
    }

    constructor(v1: Int) : this() {
        println("call constructor(v1)")
        this.v1 = v1
    }
}

class TestClass3(var a1: Int, val a2: Int) {

    init {
        println("TestClass3: call init")
        println("a1: ${a1}")
        println("a2: ${a2}")
    }

    constructor(a1: Int) : this (a1, 100){
        println("TestClass3: constructor(a1)")
    }
}
class TestClass4 constructor(var a1: Int, val a2: Int)

class TestClass2(a1: Int, a2: Int)

