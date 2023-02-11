package module2.HW5;

public class Character {
    String name;
    private int hp;
    int atk;

    public Character(String name, int hp, int atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    public void attack() {
        System.out.printf("%s has dealt %d damage!\n", this.name, this.atk);
    }

    public void defend(int damage) {
        System.out.printf("%s has lost %d hp! Current hp: %d.\n", this.name, damage, (this.hp -= damage));
    }

    public void walk(String destination) {
        System.out.printf("%s is going to %s.\n", this.name, destination);
    }

    public void welcome(){
        System.out.printf("I am a default character! My name is %s and I am strong >:)\n", this.name);
    }

}
