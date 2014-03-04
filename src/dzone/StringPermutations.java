package dzone;

public class StringPermutations {

    public static void main(String args[]) {

        String firstString = "abcdex";
        String secondString = "ecdbay";

        if (!(firstString.length() == secondString.length())) {
            System.out.println("Strings don't match");
        }

        else {
            int mask = 0;

            for (int i = 0; i < firstString.length(); i++) {
                int subMask = 1 << firstString.charAt(i);
                mask = mask | subMask;
            }

            for (int p = 0; p < secondString.length(); p++) {
                if ((mask & (1 << secondString.charAt(p))) == 0) {
                    System.out.println("Strings don't match");
                }
            }

        }
    }
}
