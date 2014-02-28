package elevator;

public class RunTIme {

    public static void main(String args[]) {

        Lift ourLift = LiftHandler.getLift();

        ourLift.start();

        ourLift.addCall(Level.First);

        ourLift.addCall(Level.Second);

        ourLift.addCall(Level.Third);

        ourLift.addCall(Level.Fourth);

    }

}
