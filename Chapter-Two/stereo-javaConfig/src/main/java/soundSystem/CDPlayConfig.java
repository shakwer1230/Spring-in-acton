package soundSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/14
 * @
 */
@Configuration
public class CDPlayConfig {
    @Bean
    public CompactDisc sgtPeppers(){
        return  new SgtPeppers();
    }
    @Bean
    public  CDPlayer cdPlayer(CompactDisc compactDisc){
        return  new CDPlayer(compactDisc);
    }
}
