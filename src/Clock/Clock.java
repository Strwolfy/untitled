package Clock;

public class Clock implements Runnable {

    @Override
    public void run() {
        Thread thread = new Thread();

        while (!thread.isInterrupted())
        {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Tik");
        }
    }

}
