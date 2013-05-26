import java.util.ArrayList;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: Manoj
 * Date: 1/17/13
 * Time: 10:50 PM
 * To change this template use File | Settings | File Templates.
 *  Explanation -  Coin problem lets you know if the given
      coins can be used to form a particular sum or not.
      Here coins are not allowed to repeat. So, once
      you picked up a coin, you are not allowed to
      pick an other one for a given sum.
 */

public class CoinProblem {

    public static void main(String args[]) {
        int[] coins = {1, 3, 5};
        int sum = 11;
        Coins[] solutions = optimize(coins, sum);
        for(int i=0; i<solutions.length; i++){
            System.out.println(" For Sum " + i + "  Minimum Coins are  " + solutions[i].getSum() + "" +
                    "  Values are " + solutions[i].getValues().toString());
        }
    }

    public static Coins[] optimize(int[] coins, int sum) {
        Coins[][] data = new Coins[sum][coins.length];
        Coins[] optimized = new Coins[sum];
        for (int i = 0; i < sum; i++) {
            int temp = 100;
            Coins min = null;
            for (int j = 0; j < coins.length; j++) {
                List values = new ArrayList();
                int diff = i - coins[j];
                if (diff == 0) {
                    values.add(j);
                    data[i][j] = new Coins(1, values);
                } else if (diff > 0) {
                    List tempvalues = optimized[diff].getValues();
                    int tempsum = optimized[diff].getSum();
                    if (tempvalues.contains(j) || tempsum ==0) {
                        //The coin has already been used
                        //Mark the sum as zero
                        data[i][j] = new Coins(0, values);
                    } else {
                        //The coin is not there
                        tempvalues.add(j);
                        data[i][j] = new Coins(tempsum + 1, tempvalues);
                    }
                } else if (diff < 0) {
                    data[i][j] = new Coins(0, values);
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

