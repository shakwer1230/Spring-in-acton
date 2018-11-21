package soundSystem;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/16
 * @
 */
@Aspect
public class TrackCounter {
    private Map<Integer,Integer> trackCounts=new HashMap<Integer, Integer>();

    // 通知PlayTrack()方法 args 传递参数
    @Pointcut("execution(* soundSystem.CompactDisc.playTrack(int ))&&args(trackNumber)")
    public  void  trackPlayed(int trackNumber){};

    //播放前为该磁道计数
    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
        int currentCount=getPlayCount(trackNumber);
        trackCounts.put(trackNumber,currentCount+1);
    }
    public int getPlayCount(int trackNumber){
        return trackCounts.containsKey(trackNumber)?trackCounts.get(trackNumber):0;
    }
}
