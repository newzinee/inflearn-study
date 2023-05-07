fun main() {
    val v1 = Number.TWO
    checkNumber(v1)

    val v2 = Number2.SealedTwo(1)
    val v3 = Number2.SealedTwo(2)
    val v4 = Number2.SealedOne(1, 2)
    checkNumber2(v2)
    checkNumber2(v3)
    checkNumber2(v4)

}

enum class Number(val num: Int) {
    ONE(1), TWO(2), THREE(3)
}

fun checkNumber(a1: Number) {
    when (a1) {
        Number.ONE -> println("1입니다.")
        Number.TWO -> println("2입니다.")
        Number.THREE -> println("3입니다.")
    }

    when (a1.num) {
        1 -> println("1입니다")
        2 -> println("2입니다")
        3 -> println("3입니다")
    }
}

sealed class Number2 {
    class SealedOne(val a1: Int, val a2: Int) : Number2() {
        fun sealedOneFun() {
            println("SealedOne 의 sealedOneFun")
        }
    }
    class SealedTwo(val a1: Int) : Number2()
    class SealedThree(val a1: Int) : Number2()
}

fun checkNumber2(obj: Number2) {
    when (obj) {
        is Number2.SealedOne -> {
            println("one")
            obj.sealedOneFun()
        }
        is Number2.SealedTwo -> {
            println("two")
            when (obj.a1) {
                1 -> println("1")
                2 -> println("2")
                else -> println("else")
            }
        }

        is Number2.SealedThree -> println("three")
    }
}