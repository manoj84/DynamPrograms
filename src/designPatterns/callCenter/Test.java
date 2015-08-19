package callCenter;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        CallHandler ch = CallHandler.getInstance();
        Caller caller = new Caller(1, "manoj");
        ch.dispatchCall(caller);

    }

}
