package concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @通过@PointCut注解声明频繁使用的切点表达式
 * @Author:lvxiaoke
 * @Date: 2018/11/15
 * @ 定义切面
 */
@Aspect
public class Audience {
    //表演之前
    @Before("execution(* concert.Performace.perform(..))")
    public void silenceCellPhones(){
        System.out.println("Sliencing cell phone");
    }

    //表演之前
    @Before("execution(* concert.Performace.perform(..))")
    public void  takeSeats(){
        System.out.println("Taking seats");
    }

    //表演之后
    @AfterReturning("execution(* concert.Performace.perform(..))")
    public void applause(){
        System.out.println("CLAP CLAP CLAP");
    }

    //表演失败
    @AfterThrowing("execution(* concert.Performace.perform(..))")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }
}
