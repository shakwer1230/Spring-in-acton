package Spitter.config;

import Spitter.web.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/21
 * @
 * 任意扩展AbstracAnnotationConfigDispatcherServletInitializer的类，都会自动配置DispatchServlet和spring 的上下文
 * 1.AbstractAnnotationConfigDispatcherServletInitializer 会同时创建DispatcherServlet 和 ContextLoaderListener
 * 2.getServletConfigClasses()方法返回带有@Configuration注解的的类用来定义DispatcherServlet应用的上下文中的bean
 * 3.getRootConfigClasses()方法返回带有@Configuration注解的类将会用来定义ContextLoaderListener创建的应用上下文中的bean
 *
 * 注意： 使用AbstractAnnotationConfigDispatcherServletInitializer配置DispatcherServlet 只能在Servlet3.0的服务器（如 tomcat7.0及以上）
 * 低于3.0只能使用web.xml配置 使用<mvc:annotation-driven></mvc>启用注解驱动的Spring MVC
 *
 */
public class SpitterWebApplication  extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /**
     * 指定配置类
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    /**
     *
     * 将一个或多个路径映射到DispatchServlet上
     * 將dispathcServlet映射到“/”
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
