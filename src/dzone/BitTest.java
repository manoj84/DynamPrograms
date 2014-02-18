package dzone;


public class BitTest {

    public static void setBit(int i, int p) {
        // int mask = 1 << p;
        // System.out.println("Before Set Bit " + Integer.toBinaryString(i)
        // + "and int is " + i);
        // i = i | mask;
        // System.out.println("After Set Bit " + Integer.toBinaryString(i)
        // + " and int is " + i);
        System.out.println(Integer.toBinaryString(144));

    }

    public static void main(String args[]) {
        // Set Bit
        int i = 9;
        int p = 3;
        setBit(i, p);
        // Get Bit
        getBit(i, p);
        // Clear Bit
        clearBit(i, p);
    }

    private static void clearBit(int i, int p) {
        int mask = 1 << p;
        int maskComplement = ~mask;
        System.out.println("Clear bit at posotion " + p + " is "
                + Integer.toBinaryString(i & maskComplement));
    }

    private static void getBit(int i, int p) {
        int mask = 1 << p;
        i = i & mask;
        System.out.println("The value of bit at position p is "
                + Integer.toBinaryString(i));
    }
}
