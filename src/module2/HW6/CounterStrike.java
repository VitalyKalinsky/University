package module2.HW6;

public class CounterStrike implements ComputerGame{
    private boolean running;

    public CounterStrike() {
        this.running = false;
    }

    @Override
    public void shoot() {
        if(this.running)
            System.out.println("You are shooting");
        else
            System.out.println("Can't shoot: CounterStrike is off");
    }

    @Override
    public void move() {
        if(this.running)
            System.out.println("You are moving");
        else
            System.out.println("Can't move: CounterStrike is off");
    }

    @Override
    public void start() {
        if (this.running) System.out.println("CounterStrike is currently running");
        else{
            this.running = true;
            System.out.println("CounterStrike has been started");
        }
    }

    @Override
    public boolean end() {
        if (!this.running) System.out.println("CounterStrike is stopped already");
        else{
            this.running = false;
            System.out.println("CounterStrike has been stopped");
        }
        return running;
    }
}
