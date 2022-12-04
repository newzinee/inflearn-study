package hello.advanced.trace.hellotrace;

import org.junit.jupiter.api.Test;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/11/30
 */
class HelloTraceV1Test {

    @Test
    void begin_end() {
        var trace = new HelloTraceV1();
        var status = trace.begin("hello");
        trace.end(status);
    }

    @Test
    void begin_exception() {
        var trace = new HelloTraceV1();
        var status = trace.begin("hello");
        trace.exception(status, new IllegalStateException());
    }

}