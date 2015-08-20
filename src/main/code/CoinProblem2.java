package code;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manoj
 * Date: 1/29/13
 * Time: 5:40 PM
 * To change this template use File | Settings | File Templates.
 * Explanation - CoinProblem resolves the issue of assigning  coins
 * to a sum with coins getting repeated.
 */
public class CoinProblem2 {

    public static void main(String args[]) {
        int[] coins = {1, 3, 5};
        int sum = 11;
        Coins[] solutions = optimize(coins, sum);
        for(int i=0; i<solutions.length; i++){
            System.out.println(" For Sum " + i + "  Minimum Coins are  " + solutions[i].getSum());
        }
    }

    public static Coins[] optimize(int[] coins, int sum) {
        Coins[][] data = new Coins[sum+1][coins.length];
        Coins[] optimized = new Coins[sum+1];
        for (int i = 0; i < sum+1; i++) {
            int temp = 100;
            Coins min = null;
            for(int j=0; j<coins.length; j++){
                List values = new ArrayList();
                int diff = i - coins[j];
                if(diff==0){
                    values.add(j);
                   data[i][j] = new Coins(1, values);
                }
                else if(diff>0){
                    int tempsum = optimized[diff].getSum();
                    List tempvalues = optimized[diff].getValues();
                    tempvalues.add(j);
                    data[i][j] = new Coins(tempsum+1, tempvalues);
                }
                else if(diff<0){
                    data[i][j] = new Coins (0, values);
                }

                if (data[i][j].getSum() < temp && data[i][j].getSum()>0 ) {
                    temp = data[i][j].getSum();
                    optimized[i] = data[i][j];
                }
                else if(temp == 100){
                    optimized[i] = data[i][j];
                }
            }
        }
        return optimized;
    }
}
