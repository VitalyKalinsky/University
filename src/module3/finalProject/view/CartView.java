package module3.finalProject.view;

import module3.finalProject.data.models.CartItem;
import module3.finalProject.data.service.ShopService;

import java.util.ArrayList;

public class CartView extends AppView {
    public final ShopService shopService;

    public CartView(ShopService shopService) {
        super("Cart", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        ArrayList<CartItem> cart = shopService.getCart();
        if(cart.isEmpty()) System.out.println("cart is empty");
        for (CartItem item : cart) {
            System.out.println(item.count + " - " + item.product.title);
        }
        System.out.println("--------------------------------");
    }
}
