package hello.advanced.trace.treadlocal;

import hello.advanced.trace.treadlocal.code.ThreadLocalService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2023/01/03
 */
@Slf4j
public class ThreadLocalServiceTest {

    private ThreadLocalService threadLocalService = new ThreadLocalService();

    @Test
    void field() {
        log.info("main start");
        Runnable userA = () -> threadLocalService.logic("userA");

        Runnable userB = () -> threadLocalService.logic("userB");

        Thread threadA = new Thread(userA);
        threadA.setName("thread-A");

        Thread threadB = new Thread(userB);
        threadB.setName("thread-B");

        threadA.start();
//        sleep(2000);
        sleep(100);
        threadB.start();

        sleep(3000);
        log.info("main exit");
    }

    private void sleep(final int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
