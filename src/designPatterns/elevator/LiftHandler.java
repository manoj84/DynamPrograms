package elevator;

public final class LiftHandler {

    private static Lift lift = null;
    private static CallQueue callQueue = null;

    private LiftHandler() {

    }

    public static Lift getLift() {
        if (lift == null) {
            callQueue = new CallQueue();
            lift = new Lift(callQueue);
            callQueue.setLift(lift);
            return lift;
        }

        else {
            return lift;
        }
    }

}
