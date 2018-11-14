package knights;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/14
 * @
 */
public class BraveKnight implements  Knight {
    private  Quest quest;

    //构造函数注入bean  注入的不是实际的Quests 实现了松耦合
    public  BraveKnight(Quest quest){
        this.quest=quest;
    }
    public void embarkOnQuest() {
        quest.embark();
    }
}
