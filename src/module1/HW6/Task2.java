package module1.HW6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(str);
        while(stringBuilder.indexOf(" ") != -1){
            stringBuilder.deleteCharAt(stringBuilder.indexOf(" "));
        }
        System.out.println(stringBuilder);
    }
}
