package hello.exception.exception;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/01/30
 */
public class UserException extends RuntimeException {

    public UserException() {
        super();
    }

    public UserException(final String message) {
        super(message);
    }

    public UserException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public UserException(final Throwable cause) {
        super(cause);
    }

    protected UserException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
