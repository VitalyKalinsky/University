package module1.HW3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� �����: ");
        int num = scanner.nextInt(), sum = 0;
        System.out.print("����� ����� �� 1 �� " + num + " ����� ");
        while(num >= 1){
            sum+=num;
            num--;
        }
        System.out.println(sum);
    }
}
