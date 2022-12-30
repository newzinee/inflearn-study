fun main() {
    try {
//        val a1 = 10 / 0
        val str: String? = null
        println(str!!.length)
    } catch (e: ArithmeticException) {
        println("예외 발생")
    } catch(e:KotlinNullPointerException) {
        println("null")
    } catch(e:Exception) {
        println("exception")
        e.printStackTrace()
    } finally {
        println("finally")
    }
    println("수행됨?")

}