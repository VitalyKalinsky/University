package module3.HW6;

public class MyPriorityQueue<T> {
    private Node first;

    private class Node {
        T value;
        int priority;
        Node next;

        public Node(T value, int priority) {
            this.value = value;
            this.priority = priority;
        }
    }

    public void add(T elem, int priority) {
        if (priority >= 0) {
            if (first == null)
                first = new Node(elem, priority);
            else {
                Node current;
                for (current = first;
                     current.next != null && current.next.priority <= priority;
                     current = current.next)
                    ;
                Node temp;
                if (first.priority > priority) {
                    temp = first;
                    first = new Node(elem, priority);
                    first.next = temp;
                } else {
                    temp = current.next;
                    current.next = new Node(elem, priority);
                    current.next.next = temp;
                }
            }
        }
    }

    public T pop() {
        Node tempFirst = first;
        first = first.next;
        return tempFirst.value;
    }

    public void print() {
        System.out.print("[");
        if (first != null) {
            Node curr;
            for (curr = first; curr.next != null; curr = curr.next) {
                System.out.print(curr.value + ", ");
            }
            System.out.println(curr.value + "]");
        }
        else
            System.out.println("]");
    }
}
