package module3.HW6;

public class Main {
    public static void main(String[] args) {
        MyPriorityQueue<Character> queue = new MyPriorityQueue<>();
        queue.add('r', 3);
        queue.add('p', 0);
        queue.add('w', 2);
        queue.add('o', 8);
        queue.add('i', 7);
        queue.add('y', 5);
        queue.add('e', 2);
        queue.add('t', 4);
        queue.add('o', 8);
        queue.add('i', 7);
        queue.add('q', 0);
        queue.add('p', 0);
        queue.add('V', 123);
        System.out.print(queue.pop());
        System.out.print(queue.pop());
        System.out.print(queue.pop());
        System.out.print(queue.pop());
        System.out.print(queue.pop());
        System.out.print(queue.pop());
        System.out.print(queue.pop());
        System.out.print(queue.pop());
        System.out.print(queue.pop());
        System.out.print(queue.pop());
        System.out.print(queue.pop());
        System.out.print(queue.pop());
        System.out.println(queue.pop());
        queue.print();
    }
}
