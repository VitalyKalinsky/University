package module3.finalProject.view;

import module3.finalProject.data.models.Product;
import module3.finalProject.data.service.ShopService;

import java.util.ArrayList;

public class CatalogView extends AppView {
    final ShopService shopService;

    public CatalogView(ShopService shopService, ArrayList<AppView> children) {
        super("Catalog", children);
        this.shopService = shopService;
    }

    @Override
    public void action() {
        ArrayList<Product> catalog = shopService.getCatalog();
        for (Product p : catalog) {
            System.out.println(p.id + " " + p.title + " " + p.price);
        }
        System.out.println();
    }
}
