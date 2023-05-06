package module3.finalProject.view;

import module3.finalProject.controllers.OrderController;
import module3.finalProject.data.service.ShopService;

import java.util.ArrayList;

public class OrderView extends AppView{
    public final ShopService shopService;
    public OrderView(ShopService shopService) {
        super("Ordering", new ArrayList<>());
        this.shopService = shopService;
    }
    @Override
    public void action() {
        OrderController orderController = new OrderController(shopService);
        if(orderController.createOrder()){
            System.out.println("successfully created");
        }else{
            System.out.println("not created");
        }
        System.out.println("--------------------------------");
    }
}
