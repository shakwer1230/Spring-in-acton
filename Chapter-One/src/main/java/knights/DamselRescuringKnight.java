package knights;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/14
 * @
 */
public class DamselRescuringKnight implements  Knight {
    public RescureDamselQuest rescureDamselQuest;

    //构造函数注入
    public DamselRescuringKnight(){
        this.rescureDamselQuest=new RescureDamselQuest();
    }

    public void embarkOnQuest() {
        rescureDamselQuest.embark();
    }
}
