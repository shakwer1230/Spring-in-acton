package soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundSystem.CDPlayConfig;
import soundSystem.CompactDisc;
import soundSystem.MediaPlayer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/15
 * @
 */
@RunWith(SpringJUnit4ClassRunner.class)//创建应用上下文
@ContextConfiguration(classes = CDPlayConfig.class)//加载配置 装载CompactDisc
public class CDPlayerTest {
    @Rule
    public  final StandardOutputStreamLog log=new StandardOutputStreamLog();

    @Autowired
    CompactDisc cd;

    @Autowired
    MediaPlayer player;


    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }

    @Test
    public  void play(){
        player.play();
        assertEquals("Sgt. Pepper's Lonely Hearts Club Band " +"by the beatles \n",log.getLog());
    }
}
