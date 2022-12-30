fun main() {
    val str1 = "abcd"
    println(str1.getUpperString())
    /*
    확장함수는 기존 클래스에 새로운 메서드를 추가하는것처럼 보이지만 실제 동작은
    객체의 주소값을 넘겨 받는 형식으로 구현되어 있다.
        public static final void main() {
          String str1 = "abcd";
          String var1 = getUpperString(str1);
          System.out.println(var1);
        }
     */
}

fun String.getUpperString() : String {
    return this.uppercase()
}