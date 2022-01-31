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
public class StringToIpPortConverter implements Converter<String, IpPort> {

    @Override
    public IpPort convert(final String source) {
        log.info("convert source = {}", source);

        final var split = source.split(":");
        final var ip = split[0];
        final var port = Integer.parseInt(split[1]);

        return new IpPort(ip, port);
    }

}
