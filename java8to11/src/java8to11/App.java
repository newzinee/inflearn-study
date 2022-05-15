package java8to11;

import java.util.Arrays;
import java.util.List;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/04/25
 */
@Chicken
public class App {

    public static void main(@Chicken String[] args) throws @Chicken RuntimeException {
        List<@Chicken String> names = Arrays.asList("yj");
    }

    static class FeelsLikeChicken<@Chicken T> {

        public static <@Chicken C> void print(@Chicken C c) {
            System.out.println(c);
        }
    }
}
