package module3.finalProject.data.data_source.catalog;

import module3.finalProject.data.models.Product;

import java.util.ArrayList;
/**
 * Data source for catalog.
 */
public abstract class CatalogDataSource {
    public abstract ArrayList<Product> getCatalog();
}
