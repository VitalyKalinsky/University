package module1.HW8;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        int min;
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[min] > array[j])
                    min = j;
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
