package scop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/11/15
 * @
 */
@Component
public class StoreServie {
    private ShopCart shopCart;
    @Autowired
    public void  setShopCart(ShopCart shopCart){
        this.shopCart=shopCart;
    }
}
