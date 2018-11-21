package Spitter.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/21
 * @
 */
@Controller //声明为一个控制器， 基于@Component注解 组件扫描枪会自动找到HomeController 声明为一个spring上下文中的bean
public class HomeController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){
        return  "home";// 视图名为home
    }
}
