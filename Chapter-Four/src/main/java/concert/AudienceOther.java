package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @ 环绕切面
 * @Author:lvxiaoke
 * @Date: 2018/11/16
 * @
 */
@Aspect
public class AudienceOther {
    @Pointcut("execution(* concert.Performace.perform(..))")
    public void performance(){};


    @Around("performance()")
    public  void watchPerformance(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("Silencing cell phone");
            System.out.println("Taking Seats");
            joinPoint.proceed();
            System.out.println("CLAP CLAP CLAP");
        }catch (Throwable e){
            System.out.println("Demanding a refund");

        }
    }
}
