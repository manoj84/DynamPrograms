import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manoj
 * Date: 1/29/13
 * Time: 7:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class LongestSubSeq {

    public static void main(String args[]) {
        int[] numbers = {3, 6, 1};
        longSubSeq(numbers);
    }

    public static void longSubSeq(int[] numbers) {
        int p = 1 << numbers.length;
        int r = p;
        while (true) {
            List data = new ArrayList();
            System.out.println(p);
            if (p == 0) break;
            p = (p - 1) & r;
        }
    }
}
