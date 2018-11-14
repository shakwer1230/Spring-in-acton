package knights;

import java.io.PrintStream;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/14
 * @
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream=stream;
    }

    //探险之前调用
    public  void singBeforeQuest(){
        stream.println("Fa la la, the knight is so brave!");
    }
    //探险之后调用
    public  void  singAfterQuest(){
        stream.println("Tee hee hee, the brave knight did embark on quest!");
    }
}
