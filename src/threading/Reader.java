public class Reader extends Thread {

    private Calculator calc = null;

    public void setCalculator(Calculator calc) {
        this.calc = calc;
    }

    public void run() {
        synchronized (this.calc) {
            try {
                this.calc.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println(this.calc.finalVal);

    }

}
