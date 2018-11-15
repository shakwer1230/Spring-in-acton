package scop;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/15
 * @
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//原型： 每次注入或通过spring上下文获取的时候，都会创建一个新的bean实例
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)//单列：在整个应用，只创建一个bean实例
//@Scope(value = WebApplicationContext.SCOPE_SESSION)//会话：为每个会话创建一个bean实例
//@Scope(value = WebApplicationContext.SCOPE_REQUEST) // 请求： 为每一次请求创建一个bean 实例
public class Notepad {

}
