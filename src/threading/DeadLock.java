package threading;

class DeadLockFirst {

    public DeadLockFirst(DeadLockSecond second) {

    }

    private int number;

    public synchronized void setNumber(int number) {
        this.number = number;
    }

    public synchronized int getNumber() {
        return this.number;

    }

}

class DeadLockSecond {

}
