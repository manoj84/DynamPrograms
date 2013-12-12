package threading;

public class Main {

    // The class demos Producer Consumer pattern
    public static void main(String args[]) {
        /*
         * Drop drop = new Drop();
         * 
         * Producer prod = new Producer(drop); Consumer cons = new
         * Consumer(drop);
         * 
         * prod.start(); cons.start();
         */
        // Demo DeadLock
        /*
         * RunnableDeadLock rdl = new RunnableDeadLock();
         * 
         * Thread thread1 = new Thread(rdl); thread1.start();
         * 
         * Thread thread2 = new Thread(rdl); thread2.start();
         */
        TestSempahore job = new TestSempahore();
        Thread thread1 = new Thread(job);
        Thread thread2 = new Thread(job);
        thread1.setName("manoj");
        thread2.setName("Nokia");
        thread1.start();
        thread2.start();

    }
}