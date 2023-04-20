package module3.HW5;

public class Main {
    public static void main(String[] args) {
        MyHashSet<String> hashSet = new MyHashSet();
        hashSet.add("sometimes you may feel bad");
        hashSet.add("but this is okay");
        hashSet.add("you may feel so lonely");
        hashSet.add("but nothing lasts forever");
        hashSet.add("so just try to hang out a bit more");
        hashSet.add("so just try to hang out a bit more");
        hashSet.add("el to remove");
//        hashSet.remove("el to remove");
        hashSet.printSet();
    }
}
