package Потоки;

import Потоки.ClockManager;

class Clock implements Runnable
{
    public void run()
    {
        while (true)
        {
            //Thread.sleep(1000);
            System.out.println("Tik");

            if (!ClockManager.isClockRun)
                return;
        }
    }
}
