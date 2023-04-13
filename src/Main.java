import module3.HW2.MyLinkedList;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        for (int i = 0; i < 15; i++)
            linkedList.add(i);
        int index = 14;
        System.out.println(linkedList);
        linkedList.add(index, 10123);
        System.out.println(linkedList);
        linkedList.remove(index);
        System.out.println(linkedList);
    }
}