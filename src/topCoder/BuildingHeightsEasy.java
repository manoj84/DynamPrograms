package topCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Div 2 Level 2
 * 
 * @author manoj
 * 
 */
public class BuildingHeightsEasy {

    public int minimum(int M, int[] heights) {

        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < (1 << heights.length); i++) {
            List<Integer> soultionIntegers = new ArrayList<Integer>();
            for (int j = 0; j < heights.length; j++) {
                if ((i & (1 << j)) > 0) {
                    soultionIntegers.add(j);
                }
            }

            // Now do the building on each subset
            // Find the highest and increase the rest
            if (soultionIntegers.size() == M) {
                Collections.sort(soultionIntegers);
                int highest = soultionIntegers.get(M - 1);
                int between = 0;
                for (int k = 0; k < soultionIntegers.size() - 1; k++) {
                    between = between + soultionIntegers.get(k);
                }

                int cost = Math.abs(highest - between);

                if (cost < minCost) {
                    minCost = cost;
                }
            }
        }

        return minCost;
    }

    public static void main(String args[]) {
        BuildingHeightsEasy bhHeightsEasy = new BuildingHeightsEasy();

        // Case 1
        int M = 2;
        int[] heights = { 1, 2, 1, 4, 3 };
        System.out.println(bhHeightsEasy.minimum(M, heights));

        // Case 2
        int M2 = 3;
        int[] heights2 = { 1, 3, 5, 2, 1 };
        System.out.println(bhHeightsEasy.minimum(M2, heights2));
    }

}
