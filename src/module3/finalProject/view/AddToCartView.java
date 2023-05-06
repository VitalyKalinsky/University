package module3.finalProject.view;

import module3.finalProject.controllers.AddToCartController;
import module3.finalProject.data.service.ShopService;

import java.util.ArrayList;

public class AddToCartView extends AppView {
    final ShopService shopService;

    public AddToCartView(ShopService shopService) {
        super("Add to cart", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        AddToCartController addToCartController = new AddToCartController(shopService);
        if (addToCartController.addToCart()) {
            System.out.println("Successful");
        } else System.out.println("Failed");
        System.out.println("--------------------------------");
    }
}
