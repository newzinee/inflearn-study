package hello.advanced.trace.strategy.code.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2023/01/04
 */
@Slf4j
public class StrategyLogic1 implements Strategy{

    @Override
    public void call() {
        log.info("비즈니스 로직 1 실행");
    }

}
