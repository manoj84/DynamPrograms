package dzone;

public class DuplicateChars {

    public static void main(String args[]) {
        String test = "Manoj";

        int mask = 0;
        for (int i = 0; i < test.length(); i++) {
            int temp = test.charAt(i) - 'a';

            if ((mask & (1 << temp)) > 0) {
                System.out.println("Dupes");
            }

            else {
                mask = mask | (1 << temp);
            }

        }
    }
}
