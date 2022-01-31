package hello.typeconverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/01/31
 */
@Slf4j
public class StringToIntegerConverter implements Converter<String, Integer> {

    @Override
    public Integer convert(final String source) {
        log.info("convert source = {}", source);
        return Integer.valueOf(source);
    }

}
