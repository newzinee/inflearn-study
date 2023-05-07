package hello.advanced.trace.callback;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2023/01/07
 */
public interface TraceCallback <T> {

    T call();
}
