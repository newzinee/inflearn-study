package java8to11;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/04/25
 */
public class App {

    public static void main(String[] args) {

    }

    static class FeelsLikeChicken<@Chicken T> {

        public static <@Chicken C> void print(C c) {
            System.out.println(c);
        }
    }
}
