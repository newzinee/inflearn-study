package hello.exception.exhandler;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/01/31
 */
@Data
@AllArgsConstructor
public class ErrorResult {

    private String code;
    private String message;
}
