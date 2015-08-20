package code.dynamicProgramming;

public class LongestCommonSubsequence {

    public static void main(String args[]) {

        /*
         * String S1 = "ACCGGTCGAGTGCGCGGAAGCCGGCCGAA"; String S2 =
         * "GTCGTTCGGAATGCCGTTGCTCTGTAAA";
         */

        String S1 = "abcd";
        String S2 = "abcd";

        LongestCommonSubsequence lcs = new LongestCommonSubsequence();

        lcs.compute(S1, S2);

    }

    private void compute(String s1, String s2) {
        int data[][] = new int[s1.length()][s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                // If we have a match
                if (s1.charAt(i) == s2.charAt(j)) {
                    if (i == 0 || j == 0) {
                        data[i][j] = 1;
                    } else {
                        data[i][j] = data[i - 1][j - 1] + 1;
                    }
                }

                else {
                    if (i == 0 || j == 0) {
                        data[i][j] = 0;
                    } else {
                        data[i][j] = Math.max(data[i - 1][j], data[i][j - 1]);
                    }
                }
            }

        }

        print(data);
        printLongest(data, s1.length() - 1, s2.length() - 1);

    }

    private void printLongest(int[][] data, int length1, int length2) {
        if (length1 == 0 || length2 == 0) {
            return;
        }

        else {
            if (data[length1][length2] == data[length1 - 1][length2 - 1]) {
                printLongest(data, length1 - 1, length2 - 1);
                System.out.println(data[length1][length2]);
            }

            else if (data[length1][length2] == data[length1][length2 - 1]) {
                printLongest(data, length1, length2 - 1);
            }

            else {
                printLongest(data, length1 - 1, length2);
            }
        }
    }

    private void print(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
