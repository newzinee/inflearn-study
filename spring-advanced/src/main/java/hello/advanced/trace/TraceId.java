package hello.advanced.trace;

import java.util.UUID;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/11/30
 */
public class TraceId {

    private String id;

    private int level;

    public TraceId() {
        this.id = createId();
        this.level = 0;
    }

    private TraceId(final String id, final int level) {
        this.id = id;
        this.level = level;
    }

    private String createId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    public TraceId createNextId() {
        return new TraceId(id, level + 1);
    }

    public TraceId createPreviousId() {
        return new TraceId(id, level - 1);
    }

    public boolean isFirstLevel() {
        return level == 0;
    }

    public String getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

}
