fun main() {
    val a1 = 2
    when (a1) {
        1 -> println("a1은 1입니다.")
        2 -> {
            println("a1은 2입니다.")
            println("a1은 2입니다.")
        }

        3 -> println("a1은 3입니다.")
    }

    when (a1) {
        1 -> println("a1은 1입니다.")
        2 -> {
            println("a1은 2입니다.")
            println("a1은 2입니다.")
        }

        3 -> println("a1은 3입니다.")
        else -> println("a1은 1,2,3이 아닙니다.")

    }

    when (a1) {
        1, 2 -> println("a1은 1이거나 2입니다.")
        3, 4 -> println("a1은 3이거나 4입니다.")
        5, 6 -> println("a1은 5이거나 6입니다.")
    }

    val a2 = 1.1
    when (a2) {
        1.1 -> println("1.1")
        2.2 -> println("2.2")
    }

    val a3 = "aa"
    when (a3) {
        "aa" -> println("aa")
        "bb" -> println("bb")
        else -> println("else")
    }

    val a4 = 5
    when (a4) {
        in 1..3 -> println("1~3 사이 숫자")
        in 4..6 -> println("4~6 사이 숫자")
        in 1..6 -> println("1~6 사이 숫자")
    }

    val str1 = setValue(1)
    val str2 = setValue(2)
    val str3 = setValue(3)
    println("str1: $str1")
    println("str2: $str2")
    println("str3: $str3")

}

fun setValue(a1: Int) = when(a1) {
    1 -> "문자열1"
    2 -> "문자열2"
    else -> "그 외"
}