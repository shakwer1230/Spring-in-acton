package scop;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/15
 * @ 购物车 bean 使用会话
 */
@Scope(value = WebApplicationContext.SCOPE_SESSION,proxyMode = ScopedProxyMode.INTERFACES)// proxyMode注入的并不是实际的bean 而是他的代理bean
// ScopedProxyMode.INTERFACES 代理实现购物车相关的接口
// 如果Shop是一个类 代理模式 proxyMode = ScopedProxyMode.TARGET_CLASS CGLib生成基于类的代理类
public class ShopCart {
}
