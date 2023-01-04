package hello.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2023/01/04
 */
@Slf4j
public class SubClassLogic1 extends AbstractTemplate {

    @Override
    protected void call() {
        log.info("비즈니스 로직1 실행");
    }

}
