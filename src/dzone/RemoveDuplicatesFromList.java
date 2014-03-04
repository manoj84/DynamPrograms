package dzone;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import scala.collection.mutable.HashSet;

public class RemoveDuplicatesFromList {

    public static void main(String args[]) {
        List<String> test = new LinkedList<String>();
        test.add("Manoj");
        test.add("Test");
        test.add("Film");
        test.add("Test");
        test.add("Manoj");

        removeDuplicatesFromList(test);

        test.add("Test");
        test.add("Manoj");

        removeDuplicatesFromListWithoutBuffer(test);
    }

    private static void removeDuplicatesFromListWithoutBuffer(List<String> test) {

        if (test == null)
            return;

        /*
         * for (int i = 0; i < test.size(); i++) { String stringOuter =
         * test.get(i); for (int j = i - 1; j >= 0; j--) { String stringInner =
         * test.get(j); if (stringInner.equals(stringOuter)) { test.remove(j); }
         * } }
         * 
         * System.out.println(test);
         */

    }

    private static void removeDuplicatesFromList(List<String> test) {
        HashSet<String> set = new HashSet<String>();

        Iterator<String> iterator = test.listIterator();

        while (iterator.hasNext()) {
            String temp = iterator.next();
            if (set.contains(temp)) {
                iterator.remove();
            }

            else {
                set.add(temp);
            }

        }

        System.out.println(test);

    }
}
