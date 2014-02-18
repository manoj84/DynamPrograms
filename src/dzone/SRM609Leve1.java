package dzone;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author manoj Brute force implementation. Runs on exponential time.
 * problem Statement
        Magical Girl Illy uses "magical strings" to cast spells. For her, a string X is magical if and only if there exists a non-negative integer k such that X is composed of k consecutive '>' characters followed by k consecutive '<' characters. Note that the empty string is also magical (for k=0). 

Once Illy picked up a String S. Each character of S was either '<' or '>'. Illy can change S by removing some of its characters. (The characters she does not remove will remain in their original order.) Illy wants to change S into a magical string by removing as few of its characters as possible. 

You are given the String S. Compute and return the length of the magical string Illy will obtain from S.
 
Definition
        
Class:  MagicalStringDiv1
Method: getLongest
Parameters: String
Returns:    int
Method signature:   int getLongest(String S)
(be sure your method is public)
    
 
Constraints
-   S will contain between 1 and 50 characters, inclusive.
-   Each character of S will be '<' or '>'.
 
Examples
0)  
        
"<><><<>"
Returns: 4
The longest magical string Illy can produce is ">><<". Its length is 4. To change S into ">><<", Illy must remove the characters at 0-based indices 0, 2, and 6.
1)  
        
">>><<<"
Returns: 6
S is already a magical string. Therefore Illy doesn't have to remove any character.
2)  
        
"<<<>>>"
Returns: 0
Illy has to remove all characters of S.
3)  
        
"<<<<><>>><>>><>><>><>>><<<<>><>>>>><<>>>>><><<<<>>"
Returns: 24
 */
public class SRM609Leve1 {

    public static void main(String args[]) {

        String s1 = "<><><<>";
        System.out.println(getLongest(s1));
        String s2 = ">>><<<";
        System.out.println(getLongest(s2));
        String s3 = "<<<>>>";
        System.out.println(getLongest(s3));
        // TODO: This is not working, solution is 24, but getting 14.
        String s4 = "<<<<><>>><>>><>><>><>>><<<<>><>>>>><<>>>>><><<<<>>";
        System.out.println(getLongest(s4));

    }

    public static int getLongest(String s) {

        char[] charArray = s.toCharArray();
        List<Character> data = null;
        int largest = 0;
        for (int i = 0; i < (1 << charArray.length); i++) {
            data = new ArrayList<Character>();
            for (int j = 0; j < charArray.length; j++) {
                if ((i & (1 << j)) > 0) {
                    data.add(charArray[j]);
                }
            }

            if (data.size() > 1 && data.size() % 2 == 0) {

                int mid = data.size() / 2;

                boolean loopBreak = false;
                int r = 1;
                for (int p = mid; p < data.size() && p >= 0; p++) {
                    if (!(data.get(p) == '<' && data.get(p - r) == '>')) {
                        loopBreak = true;
                        r = 1;
                        break;
                    }

                    else {
                        r++;
                    }
                }
                // We are done looping
                if (!loopBreak)
                    largest = Math.max(largest, data.size());
            }

        }

        return largest;
    }
}
