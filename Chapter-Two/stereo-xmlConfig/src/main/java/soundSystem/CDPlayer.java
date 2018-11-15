package soundSystem;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/15
 * @
 */
public class CDPlayer implements  MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd=cd;
    }
    public void play() {
        cd.play();
    }
}
