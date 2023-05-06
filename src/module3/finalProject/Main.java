package module3.finalProject;

import module3.finalProject.controllers.ShopController;
import module3.finalProject.data.data_source.cart.*;
import module3.finalProject.data.data_source.catalog.*;
import module3.finalProject.data.data_source.order.*;
import module3.finalProject.data.service.ShopService;
import module3.finalProject.view.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //creating mock data sources
        CatalogDataSource catalogDataSource = new MockCatalogDataSourceImpl();
        CartDataSource cartDataSource = new MockCartDataSourceImpl();
        OrderDataSource orderDataSource = new MockOrderDataSourceImpl();

        //creating shop services
        ShopService shopService = new ShopService(catalogDataSource, cartDataSource, orderDataSource);
        AddToCartView addToCartView = new AddToCartView(shopService);
        CartView cartView = new CartView(shopService);
        OrderView orderView = new OrderView(shopService);

        //creating an ArrayList of AppView to use it as an argument for creating CatalogView
        ArrayList<AppView> catalogChildren = new ArrayList<>();
        catalogChildren.add(addToCartView);
        CatalogView catalogView = new CatalogView(shopService, catalogChildren);

        //creating an ArrayList of AppView to use it as an argument for creating MainView
        ArrayList<AppView> mainChildren = new ArrayList<>();
        mainChildren.add(catalogView);
        mainChildren.add(cartView);
        mainChildren.add(orderView);
        MainView mainView = new MainView(mainChildren);

        //launching ShopController
        new ShopController(mainView, shopService).run();
    }
}
