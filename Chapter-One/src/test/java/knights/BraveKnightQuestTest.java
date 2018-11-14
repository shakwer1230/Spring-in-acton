package knights;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/14
 * @
 */
public class BraveKnightQuestTest {
    @Test
    public void  KnightShouldEmbarkOnQuest(){
        Quest mockQuest=mock(Quest.class);
        BraveKnight knight=new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();
    }
}
