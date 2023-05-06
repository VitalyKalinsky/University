package module3.finalProject.data.data_source.order;

import module3.finalProject.data.models.Order;
/**
 * Mock implementation of OrderDataSource.
 */
public class MockOrderDataSourceImpl extends OrderDataSource{
    private Order order;

    @Override
    public Order getOrder() {
        return order;
    }

    @Override
    public void createOrder(Order order) {
        this.order = order;
    }
}
