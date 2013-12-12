package threading;

public class Job implements Runnable {

    @Override
    public void run() {
        System.out.println("important Job is running from runnable");
    }

}
