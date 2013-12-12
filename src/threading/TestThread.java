package threading;

public class TestThread extends Thread {
    public void run() {
        System.out.println("Important Thread is running");
    }

    public static void main(String args[]) {
        /*
         * Test thread with run inside the thread itself
         */
        TestThread th = new TestThread();
        th.start();

        /*
         * Test thread with run in runnable.
         */
        Job jb = new Job();
        Thread th1 = new Thread(jb);
        th1.start();

    }
}
