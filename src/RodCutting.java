public class RodCutting {

    public static void main(String args[]) {

        int[] length = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] price = { 1, 5, 8, 9, 10, 17, 17, 20, 24, 30 };

        int n = 6;
        int[] mem = new int[length.length];

        System.out.println("The solution for bottom up cut is "
                + bottomUpCut(price, n, mem));
    }

    private static int bottomUpCut(int[] price, int n, int[] mem) {
        if (mem[n] != 0)
            return mem[n];
        if (n == 0)
            return 0;
        int cost = Integer.MIN_VALUE;
        for (int i = 0; i < n + 1; i++) {
            cost = Math.max(price[i], bottomUpCut(price, n - 1, mem));
            mem[i] = cost;
        }
        return cost;

    }
}
