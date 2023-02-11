package module2.HW5;

public class Wizard extends Character {
    int mana;
    int currentMana;

    public Wizard(String name, int hp, int atk, int mana) {
        super(name, hp, atk);
        this.mana = mana;
        this.currentMana = mana;
    }

    @Override
    public void welcome() {
        System.out.printf("I am a wizard! My name is %s and I enjoy abra-kadabra!\n", this.name);
    }

    public void attack(int manaUse) {
        if(manaUse > 0 && this.currentMana > manaUse) {
            super.attack();
            System.out.printf("and also has used %d mana(now has %d) and has dealt %d damage!\n",
                    manaUse, (this.currentMana -= manaUse), manaUse * 10);
        }
        else {
            System.out.println("no mana or wrong manaUse");
        }
    }
}
