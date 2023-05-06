package module3.finalProject.data.data_source.catalog;

import module3.finalProject.data.models.Product;

import java.util.ArrayList;
/**
 * Mock implementation of CatalogDataSource.
 */
public class MockCatalogDataSourceImpl extends CatalogDataSource{
    @Override
    public ArrayList<Product> getCatalog() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("id1", "SmartPhone", "some SmartPhone", 30000, true));
        products.add(new Product("id2", "LapTop", "some LapTop", 55000, true));
        products.add(new Product("id3", "SmartWatch", "some SmartWatch", 15000, true));
        products.add(new Product("id4", "EarPhones", "some EarPhones", 8000, true));
        return products;
    }
}
