package elevator;

import java.util.HashSet;
import java.util.Set;

public class CallQueue implements Runnable {
    private Lift lift = null;
    private Set<Level> calls = new HashSet<Level>();

    public void setLift(Lift lift) {
        this.lift = lift;
    }

    public void addCall(Level level) {
        calls.add(level);
    }

    @Override
    public void run() {

        while (true) {

            while (!calls.isEmpty()) {
                if (calls.contains(Level.First)) {
                    lift.doorOpen();
                    System.out.println("Door Opened at First Floor");

                    System.out.println("Door Closing");
                    lift.doorClose();
                    calls.remove(Level.First);

                }

                else if (calls.contains(Level.Second)) {
                    lift.doorOpen();
                    System.out.println("Door Opened at Second Floor");
                    System.out.println("Door Closing");
                    lift.doorClose();
                    calls.remove(Level.Second);
                }

                else if (calls.contains(Level.Third)) {
                    lift.doorOpen();
                    System.out.println("Door Opened at Third Floor");
                    System.out.println("Door Closing");
                    lift.doorClose();
                    calls.remove(Level.Third);

                }

                else {
                    lift.doorOpen();
                    System.out.println("Door Opened at Fourth Floor");
                    System.out.println("Door Closing");
                    lift.doorClose();
                    calls.remove(Level.Fourth);

                }

            }
            try {
                Thread.currentThread().sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }
}
