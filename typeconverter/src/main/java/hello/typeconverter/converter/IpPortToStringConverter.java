package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/01/31
 */
@Slf4j
public class IpPortToStringConverter implements Converter<IpPort, String> {

    @Override
    public String convert(final IpPort source) {
        log.info("convert source = {}", source);
        return source.getIp() + ":" + source.getPort();
    }

}
