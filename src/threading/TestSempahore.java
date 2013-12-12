package threading;

import java.util.concurrent.Semaphore;

public class TestSempahore implements Runnable {

    Semaphore semoSemaphore = new Semaphore(2);

    public void run() {
        try {
            semoSemaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName());
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        semoSemaphore.release();

    }

}
