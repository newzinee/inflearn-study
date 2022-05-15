package java8to11;

import java.lang.annotation.*;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/04/25
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
@Repeatable(ChickenContainer.class)
public @interface Chicken {
    String value();
}
