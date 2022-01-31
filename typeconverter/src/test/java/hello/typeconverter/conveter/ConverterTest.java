package hello.typeconverter.conveter;

import hello.typeconverter.converter.IntegerToStringConverter;
import hello.typeconverter.converter.IpPortToStringConverter;
import hello.typeconverter.converter.StringToIntegerConverter;
import hello.typeconverter.converter.StringToIpPortConverter;
import hello.typeconverter.type.IpPort;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/01/31
 */
class ConverterTest {

    @Test
    void stringToInteger() {
        final var converter = new StringToIntegerConverter();
        final var result = converter.convert("10");
        assertThat(result).isEqualTo(10);
    }

    @Test
    void integerToString() {
        final var converter = new IntegerToStringConverter();
        final var result = converter.convert(10);
        assertThat(result).isEqualTo("10");
    }

    @Test
    void ipPortToString() {
        final var converter = new IpPortToStringConverter();
        final var ipPort = new IpPort("127.0.0.1", 9090);
        final var result = converter.convert(ipPort);
        assertThat(result).isEqualTo("127.0.0.1:9090");
    }

    @Test
    void stringToIpPort() {
        final var converter = new StringToIpPortConverter();
        final var result = converter.convert("127.0.0.1:8080");
        assertThat(result).isEqualTo(new IpPort("127.0.0.1", 8080));
    }

}
