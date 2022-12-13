fun main() {
    // 한 줄 주석

    /*
    여러 줄 주석
     */

    // bytecode 로 변환되지 않음.

    print("문자열")    // System.out.print
    print("문자열")
    println("문자열")  // System.out.println
    println("문자열")

    println("값 : " + 100)
    println("값 : ${100}")


    println("세미콜론 없음")
    println("세미콜론 있음");

    println("1"); println("2"); println("3")

    // 정수 리터럴
    println(100)
    println(10000000000)    // 21억이 넘어가는 값은 자바코드에 L 을 붙여줌
    println(10000000000L)
    println(123_456_789)

    // 실수 리터럴
    println(11.11)
    println(11.11F)

    // 문자 리터럴
    println('A')
    println('가')

    // 문자열 리터럴
    println("문자열")

    // 논리 리터럴
    println(true)
    println(false)

    // raw String
    println("긴 글.\n안녕하세요.")

    println(
        """긴 글.
        |안녕하세요.
    """.trimMargin()
    )

    // 변수
    val a1: Int = 100
    println("a1: ${a1}")
    println("a1: $a1")

    val a2 = 100    // 코틀린은 자료형 생략을 추천
    println("a2: $a2")

    // var / val
    var a3: Int = 100
    val a4: Int = 100

    println("a3: $a3")
    println("a4: $a4")

    a3 = 200
    println("a3: $a3")

//    a4 = 200 // error

    var a5: Int = 100
    var a6: Int? = null
    println("a6: $a6")

    var a7: Int? = a5
    println("a7: $a7")

//    var a8: Int = a6 // error
    var a9: Int = a6!! // exception

}
