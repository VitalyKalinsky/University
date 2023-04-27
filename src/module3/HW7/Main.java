package module3.HW7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>(
                Arrays.asList(
                        new Phone("Apple", "iphone 8", 20000),
                        new Phone("Apple", "iphone 14 pro-x-max ", 90000),
                        new Phone("Apple", "iphone 5 default", 13000),
                        new Phone("Xiaomi", "redmi 11", 15000),
                        new Phone("Xiaomi", "redmi 20", 30000),
                        new Phone("Xiaomi", "redmi 7", 14000),
                        new Phone("Samsung", "galaxy 19x", 40000),
                        new Phone("Samsung", "galaxy 20x", 45000),
                        new Phone("Samsung", "galaxy 10x", 16000)));

        ArrayList<Phone> iphones = phones.stream()
                .filter(el -> el.producer.equals("Apple"))
                .collect(Collectors.toCollection(ArrayList::new));

        iphones.stream().sorted().forEach(el -> System.out.println(el.model + " - " + el.cost));
    }
}
