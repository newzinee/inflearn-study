package hello.aop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2023/03/17
 */
public class Pointcuts {

    @Pointcut("execution(* hello.aop.order..*(..))")
    public void allOrder() {
    }   // pointcut signature

    @Pointcut("execution(* *..*Service.*(..))")
    public void allService() {
    }

    @Pointcut("allOrder() && allService()")
    public void orderAndService() {
    }

}
