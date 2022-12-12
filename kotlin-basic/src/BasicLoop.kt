fun main() {
    val a1 = 1..10
    for (item in a1) {
        println("a1: $item")
    }

    val a2 = 1..10 step 2
    for (item in a2) {
        println("a2: $item")
    }

    val a3 = 10 downTo 1
    for (item in a3) {
        println("a3: $item")
    }

    val a4 = 10 downTo 1 step 2
    for (item in a4) {
        println("a4: $item")
    }

    var a5 = 0
    while (a5 < 10) {
        println("a5: $a5")
        a5++
    }

    var a6 = 0
    do {
        println("a6: $a6")
        a6++
    } while (a6 < 10)
}