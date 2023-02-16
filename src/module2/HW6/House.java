package module2.HW6;

public class House {
    public static void main(String[] args) {
        CounterStrike counterStrike = new CounterStrike();
        counterStrike.start();
        counterStrike.move();
        counterStrike.shoot();
        counterStrike.end();
        System.out.println();
        SnakesAndLadders snakesAndLadders = new SnakesAndLadders();
        snakesAndLadders.start();
        snakesAndLadders.rollDice();
        snakesAndLadders.end();
    }
}
