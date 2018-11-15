import myapp.Dessert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/15
 * @
 */
@Configuration
public class BeanConfig {
//    @Bean
//    public Dessert dessert(){
//        return  new Dessert();
//    }

    Dessert dessert;
    @Autowired
    @Qualifier("iceCream") //@Qualifier 限定装配指定的bean 参数为指定的bean的id
    public  void setDessert(Dessert dessert){
        this.dessert=dessert;
    }
}
