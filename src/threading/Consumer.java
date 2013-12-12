package threading;

public class Consumer extends Thread {

    private Drop drop = null;

    public Consumer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        System.out.println(drop.getMessage());
    }
}
