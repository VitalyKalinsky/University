package module3.finalProject.view;

import java.util.ArrayList;

public class MainView extends AppView{
    public MainView (ArrayList<AppView> children){
        super("Shop", children);
        System.out.println("Welcome to my shop!");
    }
    @Override
    public void action() {

    }
}
