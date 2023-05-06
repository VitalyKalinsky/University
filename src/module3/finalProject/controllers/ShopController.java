package module3.finalProject.controllers;

import module3.finalProject.data.service.ShopService;
import module3.finalProject.view.AppView;
import java.util.Scanner;

/**
 * Controller used for main shop process.
 */
public class ShopController {
    final AppView appView;
    public final ShopService shopService;

    public ShopController(AppView appView, ShopService shopService) {
        this.appView = appView;
        this.shopService = shopService;
    }

    /**
     * Main method of all program. Provides selecting pages.
     */
    public void run() {
        while (true) {
            appView.action();
            if (appView.children.size() == 0) break;
            appView.displayChildren();
            int value = -1;
            Scanner scanner = new Scanner(System.in);
            try {
                value = scanner.nextInt();
                System.out.println("--------------------------------");
                if (value < 0 && value > appView.children.size() + 1)
                    System.out.println("Wrong value!");
                else if (value == appView.children.size() + 1) {
                    break;
                } else new ShopController(appView.children.get(value - 1), shopService).run();
            }catch (Exception e){
                System.out.println("Wrong value");
                System.out.println("--------------------------------");
            }
        }
    }
}
