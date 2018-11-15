package inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/15
 * @
 */
@Configuration
public class ExpressiveConfig {
    @Autowired
    Environment env;

    @Bean
    public BlankDisc blankDisc(){
        return new BlankDisc(
                env.getProperty("isc.title"),
                env.getProperty("disc.artist")
        );
    }
}
