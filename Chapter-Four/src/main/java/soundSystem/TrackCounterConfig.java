package soundSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/16
 * @
 */
@Configuration
@EnableAspectJAutoProxy // 启用AspectJ 自动代理
public class TrackCounterConfig {
    @Bean
    public CompactDisc setPeppers(){
        BlankDisc blankDisc=new BlankDisc("Sgt. Pepper's Lonely Hearts Club Band","The Beatles" );
        List<String> tracks=new ArrayList<String>();
        tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
        tracks.add("With a Little Help from My Friends");

        blankDisc.setTracks(tracks);
        return  blankDisc;
    }

    @Bean
    public TrackCounter trackCounter(){
        return  new TrackCounter();
    }

}
