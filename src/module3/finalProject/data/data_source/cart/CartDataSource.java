package module3.finalProject.data.data_source.cart;

import module3.finalProject.data.models.CartItem;
import module3.finalProject.data.models.Product;
import java.util.ArrayList;

/**
 * Data source for cart.
 */
public abstract class CartDataSource {
    public abstract ArrayList<CartItem> getCart();
    public abstract void addToCart(Product product, int count);
}
