package dzone;

public class LinkedStack {

    private int length = 0;

    private Node head = null;

    public Integer pop() {
        if (head == null) {
            System.out.println("DS is empty");
            return 0;
        }

        else {
            Integer value = head.getValue();
            Node temp = head;
            head = head.nextNode;
            temp.setNextNode(null);
            length--;
            return value;
        }
    }

    public void push(Integer value) {
        head = new Node(value, head);
        length++;
    }

    public void remove(Integer value) {
        if (head == null) {
            System.out.print("Nothing to remove");
            return;
        }
        Node deleterNode = head;
        while (deleterNode.getNextNode() != null
                && deleterNode.getNextNode().value != value) {
            deleterNode = deleterNode.getNextNode();
        }

        // Now we are at the point.
        // Get the target Node
        Node tempNode = deleterNode.getNextNode();
        Node targetNode = tempNode.getNextNode();
        deleterNode.setNextNode(targetNode);
        tempNode.setNextNode(null);

    }

    /**
     * Get the mth to last element in the list
     * 
     * @param args
     */

    public Integer mthToLast(Integer index) {
        if (index == 0) {
            return head.value;
        }

        else {
            // Create 2 dummy pointers
            Node tempHead = head;
            Node tempTail = head;

            while (index != 0 && tempTail.getNextNode() != null) {
                tempTail = tempTail.getNextNode();
                index--;
            }

            while (tempTail.getNextNode() != null) {
                tempTail = tempTail.nextNode;
                tempHead = tempHead.nextNode;
            }

            // We are at the position
            return tempHead.value;
        }

    }

    public static void main(String args[]) {

        LinkedStack stack = new LinkedStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int stackLength = stack.length;

        // Test Add and Pop

        for (int i = 0; i <= stackLength; i++) {
            System.out.print(stack.pop());
        }

        System.out.println("/n");

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        // Test Remove .. Lets remove 3
        System.out.println("After removing 3");
        stack.remove(3);

        System.out.println("/n");

        // Get me third from last
        System.out.println("3rd to last element is " + stack.mthToLast(3));
    }
}