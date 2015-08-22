package code.dynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Manoj on 8/21/15.
 *
 * Code to generate all subsets of set. Runs in 2*n times.
 */
public class AllCombinations {

    private int[] data;

    public AllCombinations(int[] data) {
        this.data = data;       
    }

    public static void main (String args[]) {
        int[] data = {1,2,3,4};
        AllCombinations combinations = new AllCombinations(data);
        combinations.compute();
    }

    private void compute() {
        List<List<Integer>> allList = new ArrayList<List<Integer>>();
        for(int i=0; i<data.length; i++) {
            if(allList.size() == 0) {
                List<Integer> list = new ArrayList<>();
                list.add(data[i]);
                allList.add(list);
                continue;
            }

            else {
                int size = allList.size();
                for(int j=0; j<size; j++) {
                    List<Integer> tempList = allList.get(j);
                    List<Integer> secondTemp = new ArrayList<>(tempList);
                    secondTemp.add(data[i]);
                    allList.add(secondTemp);
                }
                List<Integer> lastList = new ArrayList<>();
                lastList.add(data[i]);
                allList.add(lastList);
            }
        }

        //Finally print all the lists.
        for(List<Integer> tempList: allList) {
            System.out.println(tempList);
        }
        System.out.println("The size is " + allList.size());
    }


}
