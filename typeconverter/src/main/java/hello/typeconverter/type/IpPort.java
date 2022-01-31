package hello.typeconverter.type;

import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/01/31
 *
 * "127.0.0.1:8080" ->
 */
@Getter
@EqualsAndHashCode
public class IpPort {

    private final String ip;
    private final int port;

    public IpPort(final String ip, final int port) {
        this.ip = ip;
        this.port = port;
    }

}
