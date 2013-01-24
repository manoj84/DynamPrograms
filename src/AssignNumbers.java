import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Manoj
 * Date: 1/16/13
 * Time: 7:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class AssignNumbers {

    public static void main (String args[]){

        int[] numbers = {1,2,3,4,5};
        int sum = 7;
        assign(numbers, sum);
    }

    private static void assign(int[] numbers, int sum) {
        for (int i=0; i<numbers.length; i++){
            ArrayList store = new ArrayList() ;
            store.add(numbers[i]);
            System.out.println(store);
            for (int j=i+1; j<numbers.length; j++){
                store.add(numbers[j]);
                System.out.println(store);
            }
            store = null;
        }
    }
}
