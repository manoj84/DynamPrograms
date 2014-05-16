package dzone;

public class PrintTriangleStars {

    public static void main(String args[]) {

        System.out.println("Printing Star .. ");
        printStar();
        System.out.println(" Printing Matrix Scan ... ");
        scanMatrix();
    }

    /**
     * Prints a Star based Representation
     */
    public static void printStar() {

        for (int i = 5; i >= 0; i--) {
            for (int p = 5 - i; p >= 0; p--) {
                System.out.print(" ");
            }

            for (int j = i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    /**
     * Scan a complete matrix.
     */

    public static void scanMatrix() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
