package hello.advanced.trace;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/11/30
 */
public class TraceStatus {

    private TraceId traceId;

    private Long startTimeMs;

    private String message;

    public TraceStatus(final TraceId traceId, final Long startTimeMs, final String message) {
        this.traceId = traceId;
        this.startTimeMs = startTimeMs;
        this.message = message;
    }

    public TraceId getTraceId() {
        return traceId;
    }

    public Long getStartTimeMs() {
        return startTimeMs;
    }

    public String getMessage() {
        return message;
    }

}
