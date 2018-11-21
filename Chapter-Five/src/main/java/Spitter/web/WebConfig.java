package Spitter.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/21
 * @
 * 用java配置创建最简单的spring mvc
 * 1.假如没有配置视图解析器，默认使用BeanNameView-Resolver,这个视图解析器会查找id与视图名称匹配的bean,并且查找的bean要实现View接口，以这样的方式来解析视图
 * 2、没有启用组件扫描 spring只能找到显示声明在配置类中的控制器；spring会把DispatcherServlet映射为默认的servlet,会处理所有请求，包括静态资源
 *
 */
//@Configuration
//@EnableWebMvc
//public class WebConfig {
    // 最简单的springmvc 配置
//}


@Configuration
@EnableWebMvc // 启用springmvc
@ComponentScan("Spitter.web")
public class WebConfig extends WebMvcConfigurerAdapter {
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver =new InternalResourceViewResolver();//配置jsp视图解析器
        resolver.setPrefix("/src/main/webapp/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    /**
     * 配置静态资源处理
     * @param configurer
     */
    @Override
    public void  configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
        configurer.enable();
    }
}