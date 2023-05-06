package module3.finalProject.data.service;

import module3.finalProject.data.data_source.cart.CartDataSource;
import module3.finalProject.data.data_source.catalog.CatalogDataSource;
import module3.finalProject.data.data_source.order.OrderDataSource;
import module3.finalProject.data.models.CartItem;
import module3.finalProject.data.models.Order;
import module3.finalProject.data.models.Product;

import java.util.ArrayList;

/**
 * The head class for shop. It provides connection between MVC model.
 * Contains instances of {@link CatalogDataSource}, {@link CartDataSource}, {@link OrderDataSource}.
 * It copies methods of data sources for more comfortable use.
 */
public class ShopService {
    /**
     * Instance of {@link CatalogDataSource}.
     */
    final CatalogDataSource catalogDataSource;
    /**
     * Instance of {@link CartDataSource}.
     */
    final CartDataSource cartDataSource;
    /**
     * Instance of {@link OrderDataSource}.
     */
    final OrderDataSource orderDataSource;

    public ShopService(CatalogDataSource catalogDataSource, CartDataSource cartDataSource, OrderDataSource orderDataSource) {
        this.catalogDataSource = catalogDataSource;
        this.cartDataSource = cartDataSource;
        this.orderDataSource = orderDataSource;
    }
    /**
     * @return ArrayList of products of catalog
     */
    public ArrayList<Product> getCatalog() {
        return catalogDataSource.getCatalog();
    }
    /**
     * @return ArrayList of cart's elements
     */
    public ArrayList<CartItem> getCart() {
        return cartDataSource.getCart();
    }

    /**
     * Adds Product to a cart.
     * @param productID ID of the product
     * @param count How many products a user wants to buy
     * @return true if there is a product with {@code productID} else false
     */
    public boolean addToCart(String productID, int count) {
        ArrayList<Product> catalog = getCatalog();
        for (Product p : catalog) {
            if (p.id.equals(productID) && p.available) {
                cartDataSource.addToCart(p, count);
                return true;
            }
        }
        return false;
    }

    /**
     * Creates an order.
     * @param name User's name
     * @param phone User's phone
     * @param address User's address (not using)
     * @param paymentType User's type of payment (not using)
     * @param deliveryTime User's order delivery time (not using)
     * @return true(in future might return false if an order wasn't created)
     */
    public boolean createOrder(String name, String phone, String address, String paymentType, String deliveryTime){
        ArrayList<CartItem> cart = getCart();
        Order newOrder = new Order(name, phone, address, paymentType, deliveryTime, cart);
        orderDataSource.createOrder(newOrder);
        return true;
    }
}
