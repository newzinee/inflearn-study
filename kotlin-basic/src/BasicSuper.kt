fun main() {
    var obj = TestClass7()
    obj.testMethod1()

    var obj2 = SubClass()
    obj2.subMethod1()
    obj2.superMethod1()
}

class TestClass7(var a2: Int) {
    var a = 100

    constructor() : this(100) {

    }

    fun testMethod1() {
        var a = 200
        println("a: $a")
        println("this.a: ${this.a}")
        fun testMethod2() {
            println("testMethod1 내부의 testMethod2")
        }
        testMethod2()
        this.testMethod2()
    }

    fun testMethod2() {
        println("testMethod2")
    }
}

open class SuperClass(var a3: Int) {
    var a1 = 100
    open var a2 = 200

    open fun superMethod1() {
        println("SuperClass 의 superMethod1")
    }
}

class SubClass : SuperClass(100) {

    override var a2 = 1000
    fun subMethod1() {
        println("a1: $a1")
        println("a2: $a2")
        println("super.a2: ${super.a2}")
    }

    override fun superMethod1() {
        super.superMethod1()
        println("Subclass의 superMethod1")
    }
}

class SubClass2 : SuperClass {
    constructor(a1:Int): super(a1) {

    }
}