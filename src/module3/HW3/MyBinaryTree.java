package module3.HW3;

public class MyBinaryTree<T> {
    private int size = 0;
    private Node root = null;

    private class Node {
        public T key;
        public Node left = null;
        public Node right = null;

        public Node(T key) {
            this.key = key;
        }
    }

    public T add(T key) {
        if (root == null) {
            root = new Node(key);
            size++;
            return null;
        }
        return addHelper(root, key);
    }

    private T addHelper(Node node, T key) {
        Comparable<? super T> k = (Comparable<? super T>) key;
        int cmp = k.compareTo(node.key);
        if (cmp < 0) {
            if (node.left == null) {
                node.left = new Node(key);
                size++;
                return null;
            }
            return addHelper(node.left, key);
        }
        if (cmp > 0) {
            if (node.right == null) {
                node.right = new Node(key);
                size++;
                return null;
            }
            return addHelper(node.right, key);
        }
        T oldValue = node.key;
        node.key = key;
        return oldValue;
    }



    public T contains(T value) {
        return containsLER(root);
    }

    private T containsLER(Node node) {
        if (node.left != null) return containsLER(node.left);
        if (node.right != null) return containsLER(node.right);
        return null;
    }

    public T get(Object key) {
        Node node = findNode(key);
        if (node == null) return null;
        return node.key;
    }

    private Node findNode(Object target) {
        Comparable<? super T> k = (Comparable<? super T>) target;
        Node node = root;
        while (node != null) {
            int cmp = k.compareTo(node.key);
            if (cmp < 0) {
                node = node.left;
            }
            if (cmp > 0) {
                node = node.right;
            }
            if (cmp == 0) return node;
        }
        return null;
    }

    private Node findParent(Object target) {
        Comparable<? super T> k = (Comparable<? super T>) target;
        Node node = root;
        Node parent = root;
        while (node != null) {
            int cmp = k.compareTo(node.key);
            if (cmp < 0) {
                parent = node;
                node = node.left;
            }
            if (cmp > 0) {
                parent = node;
                node = node.right;
            }
            if (cmp == 0) return parent;
        }
        return null;
    }

    public T remove(Object key) {
        T oldValue = get(key);
        if (key == root.key) root = delRecursive(key);
        else delRecursive(key);
        return oldValue;
    }

    private Node delRecursive(Object key) {
        Node node = findNode(key);
        Node parent = findParent(key);
        if (node.left == null && node.right == null) {
            if (node == parent.left) parent.left = null;
            if (node == parent.right) parent.right = null;
            size--;
            return parent;
        }
        if (node.right == null) {
            if (node == parent.left) parent.left = node.left;
            if (node == parent.right) parent.right = node.left;
            size--;
            return parent;
        }
        if (node.left == null) {
            if (node == parent.left) parent.left = node.right;
            if (node == parent.right) parent.right = node.right;
            size--;
            return parent;
        }
        Node tempNode = findSmallest(node.right);
        delRecursive(tempNode.key);
        node.key = tempNode.key;
        return parent;
    }

    private Node findSmallest(Node node) {
        if (node.left == null) return node;
        else {
            return findSmallest(node.left);
        }
    }

    public void printTree() {
        LER(root);
        System.out.println("__________");
    }

    private void LER(Node node) {
        if (node.left != null) LER(node.left);
        System.out.println(node.key);
        if (node.right != null) LER(node.right);
    }
}

