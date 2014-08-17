package dzone;

import java.util.LinkedList;
import java.util.List;

/*
 * Given a linked list, reverse alternate nodes and append them to end of list. Extra allowed space is O(1) 
 Examples

 Input List:  1->2->3->4->5->6
 Output List: 1->3->5->6->4->2

 Input List:  12->14->16->18->20
 Output List: 12->16->20->18->14
 */
public class ReverseAlternateNodes {

    public static void main(String args[]) {
        List<Integer> original = new LinkedList<Integer>();
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(4);
        original.add(5);
        original.add(6);

        reverseList(original);
        System.out.println("Original List :" + original);
    }

    private static void reverseList(List<Integer> original) {
        List<Integer> setIntegers = new LinkedList<Integer>();
        for (int i = 0; i < original.size(); i++) {
            if (i % 2 != 0) {
                setIntegers.add(original.remove(i));
            }
        }

        for (int i = setIntegers.size() - 1; i <= 0; i--) {
            original.add(setIntegers.get(i));

        }

        System.out.println("Modified List is : " + original);
    }
}
