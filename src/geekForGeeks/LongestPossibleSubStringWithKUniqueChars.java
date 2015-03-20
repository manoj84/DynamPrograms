package geekForGeeks;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string you need to print longest possible substring that has exactly
 * M unique characters. If there are more than one substring of longest possible
 * length, then print any one of them.
 * 
 * Examples:
 * 
 * "aabbcc", k = 1 Max substring can be any one from {"aa" , "bb" , "cc"}.
 * 
 * "aabbcc", k = 2 Max substring can be any one from {"aabb" , "bbcc"}.
 * 
 * "aabbcc", k = 3 There are substrings with exactly 3 unique characters
 * {"aabbcc" , "abbcc" , "aabbc" , "abbc" } Max is "aabbcc" with length 6.
 * 
 * "aaabbb", k = 3 There are only two unique characters, thus show error
 * message.
 * 
 * @author mmandam
 *
 */

public class LongestPossibleSubStringWithKUniqueChars {

    public static void main(String args[]) {
        LongestPossibleSubStringWithKUniqueChars lpskChars = new LongestPossibleSubStringWithKUniqueChars();
        String oneString = "aabbcc";

        lpskChars.compute(oneString, 1);
        lpskChars.compute(oneString, 2);
        lpskChars.compute(oneString, 3);

    }

    private void compute(String oneString, int max) {

        // An O(n2) solution

        for (int i = 0; i < oneString.length(); i++) {
            char start = oneString.charAt(i);
            int count = 0;
            List<String> list = new ArrayList<String>();
            StringBuffer buffer = null;
            for (int j = i + 1; j < oneString.length(); j++) {
                buffer = new StringBuffer();
                buffer.append(start);
                if (count <= max) {
                    if (oneString.charAt(j) == start) {
                        buffer.append(oneString.charAt(j));
                    }

                    else {
                        count++;
                        start = oneString.charAt(j);
                    }
                    list.add(buffer.toString());
                }

                else {
                    break;
                }
            }
            System.out.println(list);
        }
    }
}
