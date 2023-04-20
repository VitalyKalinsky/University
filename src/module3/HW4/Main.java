package module3.HW4;


public class Main {
    public static void main(String[] args) {
        MyTreeSet<Integer, String> treeSet = new MyTreeSet<>();
        treeSet.put(0, "hey");
        treeSet.put(1, "relax");
        treeSet.put(1, "this one won't be added");
        treeSet.put(2, "you do well every time, keep it up!");
        treeSet.put(3, "hope you'll have a great day <3");
        treeSet.put(4, "and remember one simple thing:");
        treeSet.put(5, "every single person has black lines");
        treeSet.put(6, "value to remove");
        treeSet.put(7, "key to remove");
        System.out.println("Contains? " + treeSet.contains("this one won't be added"));
        treeSet.removeByValue("value to remove");
        treeSet.remove(7);
        treeSet.printTree();
    }
}
