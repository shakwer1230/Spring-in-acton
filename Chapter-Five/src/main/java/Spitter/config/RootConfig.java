package Spitter.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.type.filter.RegexPatternTypeFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.regex.Pattern;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/21
 * @
 */
@EnableWebMvc
@ComponentScan(basePackages = {"Spitter"},excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class RootConfig {
    public static class WebPackage extends RegexPatternTypeFilter{

        public WebPackage() {
            super(Pattern.compile("Spitter\\.web"));
        }
    }
}
