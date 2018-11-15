package inject;

import org.springframework.beans.factory.annotation.Value;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/15
 * @
 */
public class AnotherDisc {
    public String title;
    public String artist;
    public  AnotherDisc(@Value("${disc.title}")String title,@Value("${disc.artist}")String artist){
        this.title=title;
        this.artist=artist;
    }
}
