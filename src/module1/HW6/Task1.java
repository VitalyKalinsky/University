package module1.HW6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        char[] chars = str.toCharArray();
        for (int i = 1; i < chars.length; i+=2) {
            chars[i] = Character.toUpperCase(chars[i]);
        }
        for (char c : chars) {
            System.out.print(c);
        }
    }
}
