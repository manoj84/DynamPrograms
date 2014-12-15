package dzone;

public class SquareRoot {

    public static void main(String args[]) {

        int number = 64;
        int count = 0;

        while (number != 1) {
            number = number >> 1;
            count++;
        }

        System.out.println(count);

    }

}
