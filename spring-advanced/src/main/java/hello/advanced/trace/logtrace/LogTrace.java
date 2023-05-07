package hello.advanced.trace.logtrace;

import hello.advanced.trace.TraceStatus;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2023/01/01
 */
public interface LogTrace {

    TraceStatus begin(String message);

    void end(TraceStatus status);

    void exception(TraceStatus status, Exception e);

}
