package dzone;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReturnKthElement {

    public static void main(String args[]) {

        List<String> test = new LinkedList<String>();
        test.add("Manoj");
        test.add("test");
        test.add("Super");
        test.add("hello");
        test.add("mowgli");

        System.out.println(findKthElement(test, 2));

    }

    private static String findKthElement(List<String> test, int n) {

        Iterator<String> first = test.iterator();
        Iterator<String> second = test.iterator();

        int i = 0;

        while (first.hasNext() && (!(i == n))) {
            first.next();
            i++;
        }

        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();

    }
}
