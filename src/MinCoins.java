public class MinCoins {

    public static void main(String args[]) {

        int[] coins = { 1, 2, 3, 4, 5 };
        int sum = 10;
        int[] mem = new int[sum + 1];

        System.out.println(calculate(coins, sum, mem));

    }

    private static int calculate(int[] coins, int sum, int[] mem) {
        if (sum <= 0)
            return 0;

        if (mem[sum] != 0)
            return mem[sum];

        int coin = Integer.MAX_VALUE;
        for (int i = 1; i < sum + 1; i++) {
            coin = calculate(coins, sum - 1, mem)
                    + calculate(coins, sum - 2, mem);
            mem[i] = coin;
        }

        return mem[sum];
    }
}
