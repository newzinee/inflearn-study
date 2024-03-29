fun main() {
    val array1 = arrayOf(10, 20, 30, 40, 50)
    println("array1: $array1")
    println("array1: ${array1.contentToString()}")

    val array2 = arrayOf(100, 11.11, "문자열", true)   // 권장하지는 않음
    println("array2: ${array2.contentToString()}")

    val array3 = intArrayOf(10, 20, 30, 40, 50)
    val array4 = doubleArrayOf(11.11, 22.22)
    val array5 = arrayOf<String>("문", "자", "열")
    println("array3: ${array3.contentToString()}")
    println("array4: ${array4.contentToString()}")
    println("array5: ${array5.contentToString()}")

    val array6 = Array(5, { 0 })
    println("array6: ${array6.contentToString()}")

    val array7 = Array(5) { it * 2 }
    println("array7: ${array7.contentToString()}")


    for (item in array1) {
        println("array1: ${item}")
    }

    val array8 = arrayOf(arrayOf(10,20,30), arrayOf(40,50), arrayOf(60))
    println("array8: ${array8}")
    println("array8: ${array8.contentToString()}")
    println("array8: ${array8.contentDeepToString()}")

    for (item1 in array8) {
        for (item2 in item1) {
            println("item2: $item2")
        }
    }

    println("array1 0: ${array1[0]}")
    println("array1 1: ${array1[1]}")
    println("array1 2: ${array1.get(2)}")
    println("array1 3: ${array1.get(3)}")

    println("array1: ${array1.contentToString()}")
    array1[0] = 100
    array1.set(1, 200)
    println("array1: ${array1.contentToString()}")

    println("array1 size: ${array1.size}")

    println("array1: ${array1.contentToString()}")
    val array10 = array1.plus(60)
    println("array1: ${array1.contentToString()}")
    println("array10: ${array10.contentToString()}")

    val array11 = array1.sliceArray(1..3)
    println("array11: ${array11.contentToString()}")

    println("first: ${array1.first()}")
    println("last: ${array1.last()}")
    println("30의 위치: ${array1.indexOf(30)}")
    println("130의 위치: ${array1.indexOf(130)}")
    println("평균: ${array1.average()}")
    println("합: ${array1.sum()}")
    println("개수: ${array1.count()}")
    println("개수: ${array1.size}")
    println("30을 포함하는가: ${array1.contains(30)}")
    println("1000을 포함하는가: ${array1.contains(1000)}")
    println("최대: ${array1.max()}")
    println("최소: ${array1.min()}")

    val array12 = arrayOf(5, 1, 3, 7, 10, 8)
    val array13 = array12.sortedArray()
    val array14 = array12.sortedArrayDescending()

    println("array13 : ${array13.contentToString()}")
    println("array14 : ${array14.contentToString()}")

}