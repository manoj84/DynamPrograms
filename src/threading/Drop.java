package threading;

public class Drop {

    private boolean isEmpty = true;

    private String message = null;

    public synchronized void setMessage(String s) {
        while (isEmpty) {
            try {
                wait();
            }

            catch (Exception e) {
            }

            isEmpty = false;
            this.message = s;
            notify();
        }

    }

    public synchronized String getMessage() {
        String m = null;
        while (!isEmpty) {
            try {
                wait();
            } catch (Exception e) {

            }

            isEmpty = true;
            m = message;
            message = null;
            notify();
        }
        return m;
    }
}
