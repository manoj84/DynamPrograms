package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class RodCutting {

    private static int[] length = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private static int[] price = { 0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30 };
    private static Map<Integer, Integer> table = new HashMap<Integer, Integer>();

    public static void main(String args[]) {

        int rod = 10;

        calculateCost(rod);
        System.out.println(table);

    }

    private static void calculateCost(int rod) {

        int[][] data = new int[rod][rod];

        for (int i = 1; i < rod; i++) {
            int totalCost = 0;
            for (int j = 1; j < rod; j++) {
                int temptotalCost = 0;
                int firstCut = i - j;

                if (firstCut == 0) {
                    data[i][j] = price[i];
                    if (price[i] > totalCost) {
                        totalCost = price[i];
                    }
                }

                else if (firstCut > 0) {
                    int secondCut = i - firstCut;
                    // Look up out table for optimcal costs

                    firstCut = table.get(firstCut);

                    secondCut = table.get(secondCut);

                    temptotalCost = firstCut + secondCut;
                    data[i][j] = temptotalCost;

                }
                if (temptotalCost > totalCost) {
                    totalCost = temptotalCost;
                }

            }
            table.put(i, totalCost);
        }

    }
}
