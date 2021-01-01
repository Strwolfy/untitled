package Clock;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        Thread.sleep(10000);
        clockThread.interrupt();
    }
}
