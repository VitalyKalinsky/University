package module1.HW4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = n; i > 1; i--) {
            n += i - 1;
        }
        System.out.println(n);
    }
}
