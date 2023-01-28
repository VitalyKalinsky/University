package module1.HW7;

public class JumpSearch {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i;
        }
        int elementToSearch = 50;
        //-1 означает что элемент не найден(по умолчанию)
        int indexOfElement = -1, index = 0, prevIndex = index;

        while (index < array.length && array[index] <= elementToSearch) {
            prevIndex = index;
            index += (int) Math.sqrt(array.length);
        }

        for (int i = prevIndex; i < index; i++) {
            if (array[i] == elementToSearch)
                indexOfElement = i;
        }

        System.out.println(indexOfElement);
    }
}
