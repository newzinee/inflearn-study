package hello.advanced.trace.treadlocal.code;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2023/01/03
 */
@Slf4j
public class FieldService {

    private String nameStore;

    public String logic(String name) {
        log.info("저장 name={} -> nameStore={}", name, nameStore);
        nameStore = name;
        sleep(1000);
        log.info("조회 nameStore={}", nameStore);
        return nameStore;
    }

    private void sleep(final int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
