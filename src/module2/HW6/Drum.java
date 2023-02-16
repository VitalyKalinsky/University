package module2.HW6;

public class Drum extends Instrument {
    int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Drum is playing! It's size is " + size +
                " and it's KEY value is " + KEY);
    }
}
