package hello.typeconverter.formatter;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Locale;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/01/31
 */
class MyNumberFormatterTest {

    MyNumberFormatter formatter = new MyNumberFormatter();

    @Test
    void parse() throws ParseException {
        final var result = formatter.parse("1,000", Locale.KOREA);
        assertThat(result).isEqualTo(1000L);
    }

    @Test
    void print() {
        final var result = formatter.print(1000, Locale.KOREA);
        assertThat(result).isEqualTo("1,000");
    }

}