package module4.HW1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = ()->{
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };
        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println(counter.getValue());
    }
}
