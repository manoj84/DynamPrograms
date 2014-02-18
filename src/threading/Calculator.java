package threading;

public class Calculator extends Thread {
    public int finalVal = 0;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                finalVal = finalVal + 1;
            }

            notifyAll();

        }

        System.out.print(finalVal);
    }

}
