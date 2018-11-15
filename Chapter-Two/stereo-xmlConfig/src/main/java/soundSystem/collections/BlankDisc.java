package soundSystem.collections;

import soundSystem.CompactDisc;

import java.util.List;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/15
 * @
 */
public class BlankDisc implements CompactDisc{
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }
}
