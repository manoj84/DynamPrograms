package dzone;

import java.util.Stack;

public class LinkedListPalindrome {

    public static void main(String args[]) {
        CustomNode head = new CustomNode("A");
        CustomNode firNode = new CustomNode("N");
        head.setNode(firNode);
        CustomNode seNode = new CustomNode("X");
        firNode.setNode(seNode);
        CustomNode thirNode = new CustomNode("N");
        seNode.setNode(thirNode);
        CustomNode foNode = new CustomNode("A");
        thirNode.setNode(foNode);

        CustomNode tail = head;
        checkPalindrome(head, tail);

    }

    private static void checkPalindrome(CustomNode head, CustomNode tail) {

        if (head == null)
            return;

        Stack<String> stack = new Stack<String>();
        stack.push(tail.getValue());
        checkPalindrome(head.getNext().getNext(), tail.getNext());

        if (!(head.getValue().equals(stack.pop()))) {
            System.out.println("No Plaidrome");
            return;
        }

    }
}
