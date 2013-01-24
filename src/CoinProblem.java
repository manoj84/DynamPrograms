
import sun.jdbc.odbc.JdbcOdbcInputStream;

import java.util.ArrayList;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: Manoj
 * Date: 1/17/13
 * Time: 10:50 PM
 * To change this template use File | Settings | File Templates.
 */

public class CoinProblem {

    public static void main(String args[]) {
        int[] coins = {1, 3, 5};
        int sum = 11;
        optimize(coins, sum);
    }

    public static void optimize(int[] coins, int sum) {
        Coins[] [] data = new Coins[coins.length][sum];
        Coins[] optimized = new Coins[sum];
        for (int i =0; i<sum; i++){
            int temp = 100;
            for (int j=0; j<coins.length; j++){
                List values = new ArrayList();
                int diff = i - coins[j];
                if (diff == 0) {
                    values.add(j);
                    data[i][j] = new Coins(1, values);
                }
                else if (diff > 0) {
                      List values = optimized[diff].getValues();
                      if (values.contains(j)){
                          //The coin has already been used
                          //Mark the sum as zero
                      }

                }
                else if (diff <0){

                }

                if(data[i][j]<temp && data[i][j]>0) temp = data[i][j];
            }
            if(temp !=100) optimized[i]  = temp;
        }
        System.out.println(data);
    }

}
