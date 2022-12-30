fun main() {
//    val obj1 = Super1()
//    testFun1(obj1)

    val sub1 = Sub1()
    testFun1(sub1)
}

open abstract class Super1 {
    fun method1() {
        println("Super1의 method1")
    }

    open abstract fun method2()

}

class Sub1 : Super1() {
    override fun method2() {
        println("Sub2의 method2")
    }
}

fun testFun1(obj1: Super1) {
    obj1.method1()
    obj1.method2()
}