package main.java;

import java.util.PriorityQueue;

/**
 * 
 * @author manoj Find the max number of coins, to produce a given sum. This will
 *         not work with priority Queue.
 */

public class CoinProblemPriorityQueue {
    private int[] coins;
    private int total;

    public static void main(String args[]) {
        int[] coins = { 7, 3, 2, 4, 6, 5, 1 };
        int total = 9;
        CoinProblemPriorityQueue queue = new CoinProblemPriorityQueue(coins,
                total);
    }

    public CoinProblemPriorityQueue(int[] coins, int total) {
        this.coins = coins;
        this.total = total;
        heap();
    }

    private void heap() {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int i = 0; i < coins.length; i++) {
            queue.add(coins[i]);
        }

        int k = 0;
        while (k < 9) {
            int i = queue.poll();
            int j = queue.poll();
            k = i + j;
            queue.add(k);
            System.out.println(i + "got added with" + j);
        }

        if (k == 9)
            System.out.println("The sum is " + queue.toString());
        else
            System.out.println("The sum cannot be formed with given coins");
    }
}
