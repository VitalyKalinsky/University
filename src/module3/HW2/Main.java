package module3.HW2;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        for (int i = 0; i < 15; i++)
            linkedList.add(i);
        int index = 14;
        System.out.println(linkedList);
        //adds element on index
        linkedList.add(index, 10123);
        System.out.println(linkedList);
        System.out.println("index of " + 10123 + " is " + linkedList.indexOf(10123));
        //removes element
        linkedList.remove((Integer) 10123);
        //removes element on index
        linkedList.remove(10);
        System.out.println(linkedList);
    }
}
