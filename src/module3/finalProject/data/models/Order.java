package module3.finalProject.data.models;

import java.util.ArrayList;
/**
 * This class is just a simple data class for orders
 * with its own name, phone etc.
 */
public class Order {
    public final String name;
    public final String phone;
    public final String address;
    public final String paymentType;
    public final String deliveryTime;
    public final ArrayList<CartItem> cart;

    public Order(String name, String phone, String address, String paymentType, String deliveryTime, ArrayList<CartItem> cart) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.paymentType = paymentType;
        this.deliveryTime = deliveryTime;
        this.cart = cart;
    }
}
