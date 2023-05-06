package module3.finalProject.data.models;

import module3.finalProject.data.data_source.cart.CartDataSource;
/**
 * This class is an elements' class for {@link CartDataSource#getCart()}
 */
public class CartItem {
    public final Product product;
    public final int count;

    public CartItem(Product product, int count) {
        this.product = product;
        this.count = count;
    }
}
