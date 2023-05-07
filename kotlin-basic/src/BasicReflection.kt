import kotlin.reflect.KClass
import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.primaryConstructor

fun main() {

    println(String::class)
    println(String::class.java)

    val a1: KClass<String> = String::class
    val a2: Class<String> = String::class.java
    println("a1: $a1")
    println("a2: $a2")

    val str1: String = "안녕하세요"
    val a3: KClass<out String> = str1::class
    val a4: Class<out String> = str1::class.java

    println("a3: $a3")
    println("a4: $a4")

    val a5: KClass<*> = str1::class
    val a6: Class<*> = str1::class.java
    println("a5: $a5")
    println("a6: $a6")

    val test1: TestClass = TestClass()
//    val a7: KClass<TestClass> = test1::class      // error
//    val a8: Class<TestClass> = test1::class.java  // error
    val a7: KClass<*> = test1::class
    val a8: Class<*> = test1::class.java
    println("a7: $a7")
    println("a8: $a8")

    // 클래스 정보 분석
    println("추상 클래스? ${test1::class.isAbstract}")
    println("Companion ? ${test1::class.isCompanion}")
    println("Data ? ${test1::class.isData}")
    println("final ? ${test1::class.isFinal}")
    println("open ? ${test1::class.isOpen}")
    println("inner ? ${test1::class.isInner}")
    println("sealed ? ${test1::class.isSealed}")

    println("------------------")

    // 생성자
    val constructors = test1::class.constructors
    println(constructors)
    for (con in constructors) {
        println("constructor: $con")

        for (param in con.parameters) {
            println("parameter index : ${param.index}")
            println("parameter type : ${param.type}")
            println("parameter name: ${param.name}")
            println("-------------")
        }
    }

    // primary constructor
    val primaryConstructor = test1::class.primaryConstructor
    if (primaryConstructor != null) {
        println(primaryConstructor)

        for (param in primaryConstructor.parameters) {
            println("parameter index : ${param.index}")
            println("parameter type : ${param.type}")
            println("parameter name: ${param.name}")
            println("-------------")
        }
    }

    // property
    val declaredMemberProperties = test1::class.declaredMemberProperties
    for (prop in declaredMemberProperties) {
        println("prop.name: ${prop.name}")
    }

    // method
    val declaredMemberFunctions = test1::class.declaredMemberFunctions
    for (met in declaredMemberFunctions) {
        println("met.name: ${met.name}")
    }
}

class TestClass() {
    val number1: Int = 100
    var number2: Int = 200

    constructor(a1: Int) : this() {

    }

    constructor(a1: Int, a2: Double) : this() {

    }

    fun testMethod() {

    }
}