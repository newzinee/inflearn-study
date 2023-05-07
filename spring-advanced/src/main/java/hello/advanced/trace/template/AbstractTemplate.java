package hello.advanced.trace.template;

import hello.advanced.trace.TraceStatus;
import hello.advanced.trace.logtrace.LogTrace;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2023/01/04
 */
public abstract class AbstractTemplate<T> {

    private final LogTrace trace;

    public AbstractTemplate(LogTrace trace) {
        this.trace = trace;
    }

    public T execute(String message) {
        TraceStatus status = null;
        try {
            status = trace.begin(message);

            T result = call();

            trace.end(status);
            return result;

        } catch(Exception e) {
            trace.exception(status, e);
            throw e;
        }
    }

    protected abstract T call();
}
