package dynamicProgramming;

/**
 * Find the longest palindrome out of a given sequence
 * 
 * @author manoj
 * 
 */

public class LongestPalindrome {

    public static StringBuffer answer = new StringBuffer();

    public static void main(String args[]) {
        String s = "aibohphobia";
        LongestPalindrome lpd = new LongestPalindrome();

        lpd.compute(s, 0, s.length() - 1);
        if (s.length() / 2 == 0) {
            answer.append(s.charAt(s.length() / 2));
        }
        System.out.print(answer);
        if (s.length() / 2 != 0) {
            System.out.print(s.charAt(s.length() / 2));
        }
        System.out.println(answer.reverse());
    }

    private int compute(String s, int start, int end) {
        if (start == end || start > end) {
            return 0;
        } else {
            if (s.charAt(start) == s.charAt(end)) {
                answer.append(s.charAt(start));
                return 1 + compute(s, start + 1, end - 1);

            }

            else {
                return Math.max(compute(s, start, end - 1),
                        compute(s, start + 1, end));
            }
        }
    }
}
