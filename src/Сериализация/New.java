package Сериализация;

public class New {
    public synchronized Runnable getjob() throws InterruptedException {
        this.wait();
        return null;
    }

    public void kill (char c) {
        char a = c;
        char b = c;

        //synchronized (a) { }
    }
}
