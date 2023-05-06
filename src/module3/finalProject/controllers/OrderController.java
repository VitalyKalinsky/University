package module3.finalProject.controllers;

import module3.finalProject.data.service.ShopService;

import java.util.Scanner;
/**
 * Controller used for ordering process.
 */
public class OrderController{
    public final ShopService shopService;

    public OrderController(ShopService shopService) {
        this.shopService = shopService;
    }

    /**
     * This method provides creating an order
     * with user's name and phone.
     */
    public boolean createOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        System.out.print("Enter your phone:");
        String phone = scanner.nextLine();
        System.out.println("Your order :");
        shopService.getCart().forEach(item -> System.out.println("    " + item.count + " - " + item.product.title));
        System.out.print("Was ");
        return shopService.createOrder(name, phone, "address", "paymentType", "deliveryTime");
    }
}
