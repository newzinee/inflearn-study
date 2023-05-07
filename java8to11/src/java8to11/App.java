package java8to11;

import java.util.Arrays;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/04/25
 */
@Chicken("양념")
@Chicken("간장")
public class App {

    public static void main( String[] args) {

        final var chickens = App.class.getAnnotationsByType(Chicken.class);
        Arrays.stream(chickens).forEach(c -> System.out.println("c = " + c.value()));

        final var chickenContainer = App.class.getAnnotation(ChickenContainer.class);
        Arrays.stream(chickenContainer.value()).forEach(c -> System.out.println("cc = " + c.value()));
    }

}
