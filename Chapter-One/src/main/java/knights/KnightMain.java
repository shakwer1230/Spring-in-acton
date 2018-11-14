package knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/14
 * @
 */
public class KnightMain {
    public static  void  main(String []args) {
        ClassPathXmlApplicationContext context=null;
        try {
            //加载Spring上下文
//            context=new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");

            //切邊編程
            context=new ClassPathXmlApplicationContext("META-INF/spring/minstrel.xml");

            //获取knight bean
            Knight knight=context.getBean(Knight.class);
            //使用knight
            knight.embarkOnQuest();
        }catch (Exception e){
            System.out.println(e.toString());
        }finally {
            if(context!=null){
                context.close();
            }
        }
    }
}
