package knights;

import java.io.PrintStream;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/14
 * @
 */
public class SlayDragonQuest implements Quest {
    private PrintStream printStream;

    public  SlayDragonQuest(PrintStream printStream){
        this.printStream=printStream;
    }
    public void embark() {
        printStream.println("Embarking on quest to slay the dragon");
    }
}
