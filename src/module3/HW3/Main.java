package module3.HW3;

public class Main {
    public static void main(String[] args) {
        MyBinaryTree<Integer> tree = new MyBinaryTree();
        for (int i = 2; i < 10; i++) {
            tree.add(i);
        }
        tree.add(1);
        tree.add(1235);
        tree.printTree();
        tree.remove(1);
        tree.remove(4);
        tree.remove(1235);
        tree.printTree();
    }
}
