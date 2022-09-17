package hello.jdbc.connection;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/09/17
 */
@Slf4j
class DBConnectionUtilTest {

    @Test
    void connection() {
        final var connection = DBConnectionUtil.getConnection();
        assertThat(connection).isNotNull();
    }
}
