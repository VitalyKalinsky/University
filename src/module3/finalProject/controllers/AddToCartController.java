package module3.finalProject.controllers;

import module3.finalProject.data.models.Product;
import module3.finalProject.data.service.ShopService;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Controller used for adding to cart process.
 */
public class AddToCartController {
    public final ShopService shopService;

    public AddToCartController(ShopService shopService) {
        this.shopService = shopService;
    }
    /**
     * This method provides adding to a cart some products
     * using user's input id and count.
     */
    public boolean addToCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product id: ");
        String productID = scanner.nextLine().replaceAll(" ", "");
        int count = -1;
        try {
            System.out.print("Enter count: ");
            count = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
        }
        System.out.print("Adding " + count + " " + shopService.getCatalog()
                .stream()
                .filter(product -> product.id.equals(productID))
                .findAny()
                .orElse(new Product(null, "Wrong product", null, 0, false))
                .title + " is ");
        return shopService.addToCart(productID, count);
    }
}
