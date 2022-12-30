fun main() {
    val set1 = setOf(1, 5, 10, 1, 5, 10)
    println("set1: ${set1}")

    val set2 = mutableSetOf<Int>()
    println("set2: $set2")

//    println("set1 0: ${set1.get(0)}") // error
//    println("set1 0: ${set1[0]}")     // error

    for (item in set1) {
        println("set1: $item")
    }

    println("set1 size: ${set1.size}")

    println("set2: $set2")
    set2.add(10)
    set2.add(20)
    set2.addAll(listOf(20, 30, 30, 40, 50))
    println("set2: $set2")

    set2.remove(30)
    println("set2: $set2")

    val set3 = set1.toMutableSet()
    set3.add(100)
    println("set3: $set3")

    val set4 = set3.toSet()
    // set4.add(2000)   // error

    val list100 = listOf(10, 20, 30, 10, 20, 30)
    println("list100: ${list100}")

    val set5 = list100.toSet()
    val set6 = list100.toMutableSet()
    println("set5: $set5")
    println("set6: $set6")

    val set7 = set5.toList()
    val set8 = set5.toMutableList()
    println("set7: $set7")
    println("set8: $set8")
}