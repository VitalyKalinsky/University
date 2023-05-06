package module3.finalProject.data.data_source.cart;

import module3.finalProject.data.models.CartItem;
import module3.finalProject.data.models.Product;

import java.util.ArrayList;

/**
 * Mock implementation of CartDataSource.
 */
public class MockCartDataSourceImpl extends CartDataSource{
    private ArrayList<CartItem> cart = new ArrayList<>();
    @Override
    public ArrayList<CartItem> getCart() {
        return cart;
    }

    @Override
    public void addToCart(Product product, int count) {
        cart.add(new CartItem(product, count));
    }
}
