package module3.HW2;

public class MyLinkedList<E> {
    private class Node {
        public E element;
        public Node next;
        public Node(E element) {
            this.element = element;
            next = null;
        }
        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
        public String toString() {
            return "Node = " + this.element.toString();
        }
    }

    private int size;
    private Node head;

    public MyLinkedList() {
        size = 0;
        head = null;
    }
    private Node getNode(int index) {
        if (index < 0 || index > size - 1) throw new IndexOutOfBoundsException();
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public E get(int index) {
        Node node = getNode(index);
        return node.element;
    }

    public int indexOf(Object obj) {
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (obj.equals(node.element)) return i;
            node = node.next;
        }
        return -1;
    }
    public boolean add(E element) {
        if(head == null) {
            head = new Node(element);
        }
        else {
            Node node = head;
            for ( ; node.next != null; node = node.next) ;
            node.next = new Node(element);
        }
        size++;
        return true;
    }
    public void add(int index, E element) {
//        Node after = getNode(index);
//        getNode(index - 1).next = null;
//        add(element);
//        getNode(index).next = after;
//        System.out.println(after.element);

        Node current = new Node(element);
        if(index <= 0) {
            current.next = head;
            head = current;
        }
        else if(index > size - 1){
            add(element);
        } else{
            current.next = getNode(index);
            getNode(index - 1).next = current;
        }
        size++;
    }
    public E remove(int index) {
        E removed = get(index);
        getNode(index - 1).next = getNode(index + 1);
        return removed;
    }
    public boolean remove(Object obj) {
        if(indexOf(obj) == -1)
            return false;
        remove(indexOf(obj));
        return true;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        String str = "[";
        for (Node node = head; node != null; node = node.next) {
            str += node.element.toString() + (node.next == null ? "]" : ", ");
        }
        return str;
    }
}
