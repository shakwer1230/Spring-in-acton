package concert;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/15
 * @
 */
public interface Performace {
//    execution(* concert.Performace.perform(..)) and (concert.*) // 指定包
//    execution(* concert.Performace.perform(..)) within (concert.*)// 指定包
//    execution(* concert.Performace.perform(..)) and  bean("work")// 指定beanid
//    execution(* concert.Performace.perform(..)) and  !bean("work")// 排除beanid
    void perform();

}
