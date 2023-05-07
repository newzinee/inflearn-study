package hello.advanced.app.v5;

import hello.advanced.trace.callback.TraceTemplate;
import hello.advanced.trace.logtrace.LogTrace;
import org.springframework.stereotype.Repository;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/11/27
 */
@Repository
public class OrderRepositoryV5 {

    private final TraceTemplate template;

    public OrderRepositoryV5(final LogTrace trace) {
        this.template = new TraceTemplate(trace);
    }

    public void save(String itemId) {

        template.execute("OrderRepositoryV5.save()", () -> {
            // 저장 로직
            if ("ex".equals(itemId)) {
                throw new IllegalStateException("예외 발생");
            }
            sleep(1000);
            return null;
        });

    }

    private void sleep(final int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
