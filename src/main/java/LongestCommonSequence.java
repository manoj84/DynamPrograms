/**
 * Created with IntelliJ IDEA.
 * User: Manoj
 * Date: 2/12/13
 * Time: 11:29 PM
 * To change this template use File | Settings | File Templates.
 */

package main.java;

public class LongestCommonSequence {

    public static void main(String args[]) {
        String test1 = "AAA";
        String test2 = "AAB";

        commonSubSequence(test1, test2);
    }

    public static String commonSubSequence(String test1, String test2) {
        char[] test1char = test1.toCharArray();
        char[] test2char = test2.toCharArray();

        int[][] data = new int[test1char.length][test2char.length];

        for (int i = 0; i < test1char.length; i++) {
            for (int j = 0; j < test2char.length; j++) {

                if (test1char[i] == test2char[j]) {
                    data[i][j] = 1;
                } else {
                    data[i][j] = 0;
                }
            }
        }

        return "";

    }

}