package code.dynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mmandam on 8/19/15.
 * <p/>
 * Find how many numbers of length n are there such that each number is at least 4 smaller/greater than the number before and after it.
 * Eg: if n = 5, such numbers are 39518, 15951, etc.
 */

public class CC5085262709260288 {

    private int size = 0;
    private Map<Integer, List<Integer>> memCache = new HashMap<Integer, List<Integer>>();
    private Map<Integer, Integer> memeoizedCache = new HashMap<Integer, Integer>();
    private int[] results = new int[10];

    public static void main(String args[]) {
        CC5085262709260288 test = new CC5085262709260288(2);
        test.compute();

    }

    private int compute() {

        memCache.put(10, new ArrayList<Integer>());
        for (int i = 11; i < 20; i++) {
            List values = new ArrayList<Integer>();
            values.add(i - 10);
            memCache.put(i, values);
        }

        for (int j = 20; j < 29; j++) {
            if(!memCache.containsKey(j-10)){
                continue;
            }
            List<Integer> values = memCache.get(j - 10);
            for (Integer r : values) {
                //First check if we have a value in memCache
                if (memCache.containsKey(r)) {
                    List moreValues = memCache.get(r);
                } else {
                    List<Integer> moreValues = getValues(r);
                    memCache.put(r, moreValues);
                }
            }
        }

        //Just to demo what I have
        for(int p =1; p<10; p++) {
            List<Integer> values = memCache.get(p);
            for(Integer r: values) {
               System.out.println("" + p + r);
            }
        }

        return 0;
    }

    public CC5085262709260288(int size) {
        this.size = size;
    }

    /**
     * This function returns the number of numbers that can be filled based on previous number.
     *
     * @param number
     * @return int
     */
    public List<Integer> getValues(int number) {
        List<Integer> values = new ArrayList<Integer>();
        int temp = number + 4;
        int count = 0;
        while (Math.abs(number - temp) >= 4) {
            if (temp >= 10) {
                temp = 0;
                continue;
            }
            count++;
            values.add(temp);
            temp = temp + 1;
        }
        return values;
    }


}
