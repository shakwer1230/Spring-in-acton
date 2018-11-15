package myapp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/15
 * @
 */
@Component
@Primary //@Primary 注解 bean匹配有歧义时 标定一个优先的可选方案 设为首选的bean 同类bean 只能设置一个
@Qualifier("code") //创建自定义的限定符 与@Component 或 @Bean一起使用 ；假如限定符也不能匹配唯一bean 可以自定义注解
public class IceCream implements Dessert
{
}
