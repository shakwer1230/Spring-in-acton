package soundSystem;

import org.springframework.stereotype.Component;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/14
 * @
 */
@Component   //@component註解表明該類為作為組件類
public class SgtPeppers implements CompactDisc {
    private  String title="Sgt. Pepper's Lonely Hearts Club Band";
    private String artist="The beats";

    public void play() {
        System.out.println("Playing "+ title+" by"+ artist);
    }
}
