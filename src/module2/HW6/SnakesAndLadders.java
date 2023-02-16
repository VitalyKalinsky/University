package module2.HW6;

public class SnakesAndLadders implements TableGame {
    private boolean running;

    public SnakesAndLadders() {
        this.running = false;
    }

    @Override
    public void rollDice() {
        if (running)
            System.out.println("You rolled " + (int) (Math.random() * 6 + 1));
        else
            System.out.println("Can't rollDice: SnakesAndLadders is not started yet");
    }

    @Override
    public void start() {
        if (this.running) System.out.println("SnakesAndLadders is currently running");
        else {
            this.running = true;
            System.out.println("SnakesAndLadders has been started");
        }
    }

    @Override
    public boolean end() {
        if (!this.running) System.out.println("SnakesAndLadders is stopped already");
        else {
            this.running = false;
            System.out.println("SnakesAndLadders has been stopped");
        }
        return running;
    }

}
