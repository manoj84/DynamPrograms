import java.util.ArrayList;
import java.util.List;

public class MinimumCoins {

    public static void main(String args[]) {
        int[] coins = { 1, 2, 3, 5 };

        int sum = 7;

        // System.out.println("Minimum coins required " + minChange(sum,
        // coins));
        // System.out.println(minChangeBitManipulation(sum, coins));
        // splitNumberUsingBits(7);
        // cutRod(4);

        rodCut(7);

    }

    public static void cutRodMemoized(int length) {
        int[] lengths = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] prices = { 1, 5, 8, 9, 10, 17, 17, 2024, 30 };

    }

    public static int minChange(int amount, int[] coins) {
        int[] tab = new int[amount + 1];
        tab[0] = 0;
        for (int i = 1; i <= amount; i++) {
            tab[i] = Integer.MAX_VALUE;
            for (int j = coins.length - 1; j >= 0; j--) {
                if (i >= coins[j]) {
                    int c = 1 + tab[i - coins[j]];
                    if (c < tab[i])
                        tab[i] = c;
                }
            }
        }
        return (tab[amount]);

    }

    public static int minChangeBitManipulation(int amount, int[] coins) {
        List<Integer> subList;
        for (int i = 0; i < (1 << coins.length); i++) {
            subList = new ArrayList<Integer>();
            for (int j = 0; j < coins.length; j++) {
                if ((i & (1 << j)) > 0) {
                    subList.add(coins[j]);
                }
            }
            System.out.println(subList);
        }

        return 0;
    }

    // Rod Cutting priblem with bit manipulation
    public static void cutRod(int sum) {
        int[] lengths = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] prices = { 1, 5, 8, 9, 10, 17, 17, 2024, 30 };
        int cost = 2000;
        List<Integer> optimalPieces = null;
        List<Integer> pieces = null;
        for (int i = 0; i < (1 << (sum)); i++) {
            pieces = new ArrayList<Integer>();
            for (int j = 0; j < sum; j++) {
                if ((i & (1 << j)) > 0) {
                    pieces.add(lengths[j]);
                }
            }
            System.out.println(pieces);
            int tempCost = 0;
            int tempSize = 0;
            // Now calculate the cost
            for (Integer piece : pieces) {
                tempCost = tempCost + prices[piece];
                tempSize = tempSize + lengths[piece];
            }

            if (tempCost < cost && tempSize == sum) {
                cost = tempCost;
                optimalPieces = pieces;
            }

        }

        System.out.println("Optimal Pieces " + optimalPieces);
        System.out.println("Optimal Price " + cost);

    }

    public static void rodCut(int length) {

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.println(i + " " + j);
            }
        }

    }
}
