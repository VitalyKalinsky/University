package module1.HW3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = -1, count = 0, temp;
        while (count <= 2) {
            System.out.print("Введите число: ");
            temp = scanner.nextInt();
            if (temp < min) {
                min = temp;
            } else if (count == 0)
                min = temp;
            count++;
        }
        System.out.println("Минимальное число: " + min);
    }
}
