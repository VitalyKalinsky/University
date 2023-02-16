package module2.HW6;

public class Guitar extends Instrument {
    int stringsCount;

    public Guitar(int stringsCount) {
        this.stringsCount = stringsCount;
    }

    @Override
    public void play() {
        System.out.println("Guitar is playing! It has " + stringsCount + " strings" +
                " and it's KEY value is " + KEY);
    }
}
