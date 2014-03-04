package dzone;

import java.util.LinkedList;
import java.util.List;

public class Add2LinkedLists {

    public static void main(String args[]) {

        List<Integer> first = new LinkedList<Integer>();
        first.add(1);
        first.add(9);

        List<Integer> second = new LinkedList<Integer>();
        second.add(3);
        second.add(9);

        addListsStraight(first, second);
        addListsReverse(first, second);

    }

    private static void addListsReverse(List<Integer> first,
            List<Integer> second) {
        int carryOver = 0;
        List<Integer> result = new LinkedList<Integer>();
        for (int i = first.size() - 1; i >= 0; i--) {
            int p = first.get(i);
            int q = second.get(i);

            int sum = p + q + carryOver;

            if (sum > 10) {
                carryOver = sum / 10;
                result.add(sum % 10);
            }

            else {
                result.add(sum);
                carryOver = 0;
            }

        }
        System.out.println(result);

    }

    private static void addListsStraight(List<Integer> first,
            List<Integer> second) {

        if (first == null && second == null)
            return;

        int len1 = first.size();
        int len2 = second.size();

        int counter = 0;

        if (len1 > len2)
            counter = len1;
        else {
            counter = len2;
        }

        List<Integer> result = new LinkedList<Integer>();
        int carryOver = 0;

        for (int i = 0; i < counter; i++) {

            int p = first.get(i);
            int j = second.get(i);
            int sum = p + j + carryOver;

            if (sum > 10) {
                carryOver = sum / 10;
                result.add(sum % 10);

            }

            else {
                result.add(sum);
                carryOver = 0;
            }

        }

        if (!(carryOver == 0)) {
            result.add(carryOver);
        }

        System.out.println(result);

    }
}
