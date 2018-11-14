package knights.config;

import knights.BraveKnight;
import knights.Knight;
import knights.Quest;
import knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @基于java配置注入javabean 可以作为xml配置的替代方案
 * @Author:lvxiaoke
 * @Date: 2018/11/14
 * @
 */
@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(){
        return  new BraveKnight(quest());
    }
    @Bean
    public Quest quest(){
        return  new SlayDragonQuest(System.out);
    }
}
