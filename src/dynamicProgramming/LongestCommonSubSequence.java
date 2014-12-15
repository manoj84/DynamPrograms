package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubSequence {

    public static void main(String args[]) {
        String first = "geeksforgeeks";
        String second = "geeks";

        LongestCommonSubSequence lcs = new LongestCommonSubSequence();
        lcs.compute(first, second);
    }

    private void compute(String first, String second) {
        char[] firstSet = first.toCharArray();
        char[] secondSet = second.toCharArray();

        int firstSetSize = firstSet.length;
        int secondSetSize = secondSet.length;

        optimalSubStructure(first, second, firstSetSize, secondSetSize);

    }

    private void optimalSubStructure(String first, String second,
            int firstSetSize, int secondSetSize) {

        char[][] data = new char[first.length()][second.length()];
        List<Character> word = new ArrayList<Character>();

        for (int i = 0; i < first.length(); i++) {
            for (int j = 0; j < second.length(); j++) {
                if (i == 0 || j == 0) {
                    if (first.charAt(i) == second.charAt(j)) {
                        data[i][j] = first.charAt(i);
                        word.add((char) data[i][j]);
                    }
                }

                else {
                    if (first.charAt(i) == second.charAt(j)
                            && data[i - 1][j - 1] != ' ') {
                        data[i][j] = first.charAt(i);
                        word.add((char) data[i][j]);
                    }

                    else if (first.charAt(i) == second.charAt(j)) {
                        data[i][j] = first.charAt(i);
                    }
                }
            }
        }

        System.out.println(word);

    }
}
