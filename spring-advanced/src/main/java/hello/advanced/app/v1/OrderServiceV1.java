package hello.advanced.app.v1;

import hello.advanced.trace.TraceStatus;
import hello.advanced.trace.hellotrace.HelloTraceV1;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/11/27
 */
@Service
@RequiredArgsConstructor
public class OrderServiceV1 {

    private final OrderRepositoryV1 orderRepository;

    private final HelloTraceV1 trace;

    public void orderItem(String itemId) {

        TraceStatus status = null;
        try {
            status = trace.begin("OrderServiceV1.orderItem()");
            orderRepository.save(itemId);
            trace.end(status);
        } catch (Exception e) {
            trace.exception(status, e);
            throw e;
        }

    }
}
