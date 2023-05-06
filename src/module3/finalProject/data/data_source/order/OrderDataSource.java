package module3.finalProject.data.data_source.order;

import module3.finalProject.data.models.Order;
/**
 * Data source for orders.
 */
public abstract class OrderDataSource {
    public abstract Order getOrder();
    public abstract void createOrder(Order order);

}
