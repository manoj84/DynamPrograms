package dynamicProgramming;

public class TopDownCutRod {
    private static int[] memoized = new int[32];
    private static int[] sizes = new int[32];

    private TopDownCutRod() {
    }

    public static int cutRod(int[] prices, int n) {
        if (n == 0)
            return 0;
        int q = 0;
        for (int i = 1; i < n; i++) {
            int j = n - i;
            q = Math.max(q, prices[i] + cutRod(prices, j));
            System.out.println(i + " , " + j);
        }
        return q;

    }

    public static void main(String args[]) {

        int[] prices = { 1, 2, 3, 4 };
        int n = 4;
        long currentTime = System.currentTimeMillis();
        /*
         * System.out.println("Running Cutting Rod Program ..... " +
         */
        cutRod(prices, n);
        System.out.println("end.....");
        /*
         * System.out.println(" Time taken : ");
         * System.out.println(System.currentTimeMillis() - currentTime);
         * 
         * long currentTimeNew = System.currentTimeMillis();
         * System.out.println("Running Cutting Rod Program with memoization..... "
         * +
         */
        cutRodMemoized(prices, n);
        // System.out.println(" Time taken : ");
        // System.out.println(System.currentTimeMillis() - currentTimeNew);
        System.out.println("end...");
        cutRodVersion(4);

    }

    public static int cutRodMemoized(int[] prices, int n) {
        if (memoized[n - 1] > 0)
            return memoized[n - 1];

        if (n == 0)
            return 0;
        int q = 0;
        for (int i = 1; i < n; i++) {
            int j = n - i;
            q = Math.max(q, prices[i] + cutRodMemoized(prices, j));
            System.out.println(i + " , " + j);
        }
        memoized[n - 1] = q;
        return q;
    }

    public static void cutRodVersion(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(i + " , " + j);
            }
        }
    }
}
