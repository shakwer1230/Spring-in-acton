package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundSystem.CDPlayConfig;
import soundSystem.CompactDisc;

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
    @Autowired
    CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }
}
