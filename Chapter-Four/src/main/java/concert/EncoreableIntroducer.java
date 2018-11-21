package concert;

import org.aspectj.lang.annotation.DeclareParents;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/16
 * @
 *
 * @DeclareParents 注解 三部分组成
 * 1、vaule 属性指定了那种类型的bean 要引人该接口（该列中所有实现Performance类 标记后面加号表示Performance的子类型，而不是Performance本身）
 * 2、defaultImpl 属性指定了为引人功能实现的类
 * 3、@DeclareParents注解所标注的静态属性指明了要引人的接口，该列中要引人的是Encoreable接口
 */
public class EncoreableIntroducer {
    @DeclareParents(value = "concert.Performace+",defaultImpl = DefaultEncoreable.class)
    public  static Encoreable encoreable;
}
