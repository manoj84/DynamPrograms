package dzone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Alien Fred Hamburgers
 * 
 */
public class SRM605 {

    public static void main(String args[]) {
        // Case 1
        int[] type = { 1, 2 };
        int[] taste = { 4, 7 };
        SRM605 solution = new SRM605();

        int[] type1 = { 1, 1 };
        int[] taste1 = { -1, -1 };

        int[] type2 = { 1, 2, 3 };
        int[] taste2 = { 7, 4, -1 };

        int[] type3 = { 1, 2, 3, 2, 3, 1, 3, 2, 3, 1, 1, 1 };
        int[] taste3 = { 1, 7, -2, 3, -4, -1, 3, 1, 3, -5, -1, 0 };

        int[] type4 = { 30, 20, 10 };
        int[] taste4 = { 100000, -100000, 100000 };

        // System.out.println(solution.getNumber(type, taste));
        // System.out.println(solution.getNumber(type1, taste1));
        // System.out.println(solution.getNumber(type2, taste2));
        System.out.println(solution.getNumber(type4, taste4));
        // System.out.println(solution.getNumber(type3, taste3));

    }

    public int getNumber(int[] type, int[] taste) {
        int maxFun = 0;
        int n = type.length;

        for (int i = 0; i < (1 << n); i++) {
            List maxFunList = new ArrayList();
            for (int p = 0; p < n; p++) {
                if ((i & (1 << p)) > 0) {
                    maxFunList.add(p);
                }
            }
            // At this point, I have a subset
            // Now Iterate and add all the different stuff
            Map hs = new HashMap();
            // Check for duplicates and only keep the max type
            for (int y = 0; y < maxFunList.size(); y++) {
                int index = (int) maxFunList.get(y);
                if (!hs.containsKey(type[index]))
                    hs.put(type[index], index);

                else {
                    int val1 = (int) hs.get(index);
                    int val2 = type[index];

                    if (val1 >= val2)
                        hs.put(index, val1);
                    else {
                        hs.put(index, val2);
                    }

                }

            }

            maxFunList = new ArrayList(hs.values());
            int tasteSum = 0;
            int tempMaxSum = 0;
            for (int x = 0; x < maxFunList.size(); x++) {
                int r = (int) maxFunList.get(x);
                tasteSum = tasteSum + taste[r];
            }

            tempMaxSum = maxFunList.size() * tasteSum;

            if (tempMaxSum > maxFun)
                maxFun = tempMaxSum;

        }

        return maxFun;

    }
}
