package module3.HW1;

public class Test {
    public static void main(String[] args) {
        Sword<Steel> sword = new Sword<>(new Steel());
        System.out.println(sword.checkEndurance());
    }
}
