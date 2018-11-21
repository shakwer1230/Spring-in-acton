package concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/15
 * @
 */
@Configuration
@EnableAspectJAutoProxy //启用AspectJ自动代理
@Component
public class ConcertConfig {
    @Bean
    public Audience audience(){
        return  new Audience();
    }


}
