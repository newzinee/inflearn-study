package hello.aop.exam;

import org.springframework.stereotype.Repository;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2023/03/25
 */
@Repository
public class ExamRepository {

    private static int seq = 0;

    /**
     * 5번에 1번 실패
     */
    public String save(String itemId) {
        seq++;
        if (seq % 5 == 0) {
            throw new IllegalStateException("예외 발생");
        }
        return "ok";
    }

}
