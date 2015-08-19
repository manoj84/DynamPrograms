package elevator;

public class Lift {
    private Level currentLevel = Level.First;
    private CallQueue callQueue = null;
    private Thread liftThread = null;

    private boolean doorOpen = false;

    public Level getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(Level currentLevel) {
        this.currentLevel = currentLevel;
    }

    public void doorClose() {
        this.doorOpen = false;
    }

    public void doorOpen() {
        this.doorOpen = true;
    }

    public Lift(CallQueue callQueue) {
        this.callQueue = callQueue;
    }

    public void addCall(Level level) {
        this.callQueue.addCall(level);
    }

    public void start() {
        liftThread = new Thread(callQueue);
        liftThread.start();
    }

}
