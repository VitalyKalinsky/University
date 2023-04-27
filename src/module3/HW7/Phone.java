package module3.HW7;

public class Phone implements Comparable<Phone>{
    String producer;
    String model;
    int cost;

    public Phone(String producer, String model, int cost) {
        this.producer = producer;
        this.model = model;
        this.cost = cost;
    }

    @Override
    public int compareTo(Phone o) {
        return this.cost - o.cost;
    }
}
