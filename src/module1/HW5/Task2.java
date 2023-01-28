package module1.HW5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int max = array[0] = (int) (Math.random() * 100);
        for (int i = 1; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(max);
    }
}
