package hello.advanced.trace.hellotrace;

import org.junit.jupiter.api.Test;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/11/30
 */
class HelloTraceV2Test {

    @Test
    void begin_end() {
        var trace = new HelloTraceV2();
        var status = trace.begin("hello1");
        var status2 = trace.beginSync(status.getTraceId(), "hello2");
        trace.end(status2);
        trace.end(status);
    }

    @Test
    void begin_exception() {
        var trace = new HelloTraceV2();
        var status = trace.begin("hello1");
        var status2 = trace.beginSync(status.getTraceId(), "hello2");
        trace.exception(status2, new IllegalStateException());
        trace.exception(status, new IllegalStateException());
    }

}