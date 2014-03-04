package dzone;

public class StringPatternMatch {

    public static void main(String args[]) {

        String s1 = "waterbottle";

        String s2 = "JuicewatwaterbottleJuice";

        checkPattern(s1, s2);

    }

    private static void checkPattern(String s1, String s2) {

        char[] s1Char = s1.toCharArray();
        char[] s2Char = s2.toCharArray();

        int start = 0;

        for (int i = 0; i < s2.length(); i++) {

            if (start == s1.length())
                break;

            if (s2Char[i] == s1Char[start]) {
                // Possible Match
                start++;

            }

            else {
                if (start != 0)
                    i = i - start;
                start = 0;
            }

        }

        if (start == s1.length()) {
            System.out.println("This is subString");
        }

    }
}
