package soundSystem;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/14
 * @
 */
public class SgtPeppers implements CompactDisc {
    private  String title="Sgt. Pepper's Lonely Hearts Club Band";
    private String artist="The Beatles";

    public void play() {
        System.out.print("Playing "+ title+" by "+ artist);
    }
}
