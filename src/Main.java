import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add(123);
        System.out.println(list.get(0));
        System.out.println((String) list.get(1));
    }
}