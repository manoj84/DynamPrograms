package dzone;

/**
 * Program to find all unique chars in a string without modifying the original
 * String
 * 
 * @author manoj
 * 
 */
public class UniqueChars {

    public static void main(String args[]) {
        String text = "abcdefg";

        int bitMask = 0;

        for (int i = 0; i < text.length(); i++) {
            int bit = text.charAt(i);
            int smallMask = 1 << bit;
            if ((bitMask & smallMask) > 1) {
                System.out.println("repetetion occured");
                break;
            }

            else {
                bitMask = bitMask | smallMask;
            }
        }

    }

}
