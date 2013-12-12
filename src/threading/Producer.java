package threading;

public class Producer extends Thread {

    private Drop drop = null;

    public Producer(Drop d) {
        this.drop = d;
    }

    public void run() {
        String produce = "Producer 1";
        System.out.println("Producer set the message");
        drop.setMessage(produce);
    }
}
