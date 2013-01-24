import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manoj
 * Date: 1/24/13
 * Time: 6:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class Coins {

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public List getValues() {
        return values;
    }

    public void setValues(List values) {
        this.values = values;
    }

    public Coins (int sum, List values){
        this.sum = sum;
        this.values = values;
    }

    private int sum = 0;
    private List values = null;


}
