package restfun;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/15
 * @
 */
@Configuration
public class MagicConfig {
    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean(){
        return  new MagicBean();
    }
}
