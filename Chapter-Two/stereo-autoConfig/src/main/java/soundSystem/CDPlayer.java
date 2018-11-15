package soundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/15
 * @
 */
@Component
//@Component("cDPlay") //  若没指定beanid  默认为类名第一个字母的小写
//@Named() 可以为bean 命名 来源 java依赖规范
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    //添加Autowired 注解将CompactDisc 注入到CDPlayer中 @Autowired 可以注解在任何地方 方法 属性
    //@Autowired(required = false) //假如应用文创建的时候没有找到相关的bean 会抛出异常 添加required=false属性 避免相关异常
    //@Inject 注解跟@Autowired 一样  来源java 依赖规范 但非spring独有
    @Autowired
    public  CDPlayer(CompactDisc cd){
        this.cd=cd;
    }
    public void play() {
        cd.play();
    }
}
