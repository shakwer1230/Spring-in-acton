import soundSystem.TrackCounter;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundSystem.CompactDisc;
import soundSystem.TrackCounterConfig;
import static org.junit.Assert.assertEquals;
/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/16
 * @
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest {
    @Rule
    public final StandardOutputStreamLog log =new StandardOutputStreamLog();

    @Autowired
    private CompactDisc cd;

    @Autowired
    TrackCounter counter;

    @Test
    public void testTrackCounter(){
        cd.playTrack(1);
        cd.playTrack(2);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(7);

        assertEquals(1,counter.getPlayCount(1));
        assertEquals(1,counter.getPlayCount(2));
    }
}
