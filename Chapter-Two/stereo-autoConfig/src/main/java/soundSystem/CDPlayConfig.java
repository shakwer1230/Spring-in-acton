package soundSystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/14
 * @
 */
@Configuration
@ComponentScan("soundSystem") //1、@ComponentScan註解在spring中啟用組件掃描 默認掃描配置類下相同的包
//2、@ComponentScan(basePackages = {"soundSystem","otherPackage"}) // 设置多个扫描包
//3、@ComponentScan(basePackageClasses = {CDPlayer.class,CompactDisc.class})// 类所在的包将会作为组件扫描的基础包
public class CDPlayConfig {
}
