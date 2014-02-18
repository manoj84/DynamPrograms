package threading;

public class TestCalcAndReader {

    public static void main(String args[]) {
        Calculator calculator = new Calculator();

        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();

        reader1.setCalculator(calculator);
        reader2.setCalculator(calculator);
        reader3.setCalculator(calculator);

        reader1.start();
        reader2.start();
        reader3.start();
        calculator.start();
    }

}
