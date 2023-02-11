package module2.HW5;

public class Archer extends Character {
    int arrows;
    int currentArrows;

    public Archer(String name, int hp, int atk, int arrows) {
        super(name, hp, atk);
        this.arrows = arrows;
        this.currentArrows = arrows;
    }

    public void shoot() {
        System.out.printf("%s has shot and dealt %d damage!\n", this.name, this.atk);
    }

    @Override
    public void welcome() {
        System.out.printf("I am an archer! My name is %s and I enjoy shooting!\n", this.name);
    }

    public void attack(int arrowUse) {
        if (arrowUse > 0 && this.currentArrows > arrowUse) {
            this.shoot();
            System.out.printf("%s also has shot %d arrows(now has %d) and has dealt %d damage!\n",
                    this.name, arrowUse, (this.currentArrows -= arrowUse), arrowUse * 10);
        } else {
            System.out.println("no arrows or wrong arrowUse");
        }
    }
}
