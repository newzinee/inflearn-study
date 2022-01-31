package hello.typeconverter.formatter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.format.Formatter;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/01/31
 */
@Slf4j
public class MyNumberFormatter implements Formatter<Number> {

    @Override
    public Number parse(final String text, final Locale locale) throws ParseException {
        log.info("text = {}, locale = {}", text, locale);
//        "1,000" -> 1000
        final var format = NumberFormat.getInstance(locale);
        return format.parse(text);
    }

    @Override
    public String print(final Number object, final Locale locale) {
        log.info("object = {}, locale = {}", object, locale);
        return NumberFormat.getInstance(locale).format(object);
    }

}
