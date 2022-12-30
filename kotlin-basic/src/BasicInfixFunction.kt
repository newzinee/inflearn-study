fun main() {
    val v1 = 100
    val r1 = 100 add2 200
    val r2 = v1 add2 200
    val r3 = v1.add2(200)

    println("r1 = ${r1}")
    println("r2 = ${r2}")
    println("r3 = ${r3}")
}

infix fun Int.add2(a1:Int) : Int {
    return this + a1
}