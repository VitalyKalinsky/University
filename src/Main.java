import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        int current;
        int temp;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        for (current = 0; current < array.length; current++) {
            for (int j = 0; j < current; j++) {
                if(array[j] > array[current]){
                    temp = array[current];
                    array[current] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
