package hello.typeconverter.formatter;

import hello.typeconverter.converter.IpPortToStringConverter;
import hello.typeconverter.converter.StringToIpPortConverter;
import hello.typeconverter.type.IpPort;
import org.junit.jupiter.api.Test;
import org.springframework.format.support.DefaultFormattingConversionService;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/01/31
 */
class FormattingConversionServiceTest {

    @Test
    void formattingConversionService() {
        final var conversionService = new DefaultFormattingConversionService();
        // converter registry
        conversionService.addConverter(new StringToIpPortConverter());
        conversionService.addConverter(new IpPortToStringConverter());

        // formatter registry
        conversionService.addFormatter(new MyNumberFormatter());

        // converter usage
        final var ipPort = conversionService.convert("127.0.0.1:8080", IpPort.class);
        assertThat(ipPort).isEqualTo(new IpPort("127.0.0.1", 8080));

        // formatter usage
        assertThat(conversionService.convert(1000, String.class)).isEqualTo("1,000");
        assertThat(conversionService.convert("1,000", Long.class)).isEqualTo(1000);

    }

}
