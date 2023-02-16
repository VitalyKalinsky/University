package module2.HW6;

public class Trumpet extends Instrument{
    int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Trumpet is playing! It's diameter is " + diameter +
                " and it's KEY value is " + KEY);
    }
}
