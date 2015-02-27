package dzone;

public class MergeLinkedList {

    public class Node {
        private Integer i = null;
        private Node next = null;

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node node) {
            next = node;
        }

        public Node(Integer i) {
            this.i = i;
        }

        public Node() {

        }

        public void setInteger(Integer i) {
            this.i = i;
        }

    }

    public Node mergeList(Node n1, Node n2) {

        // Merge the list
        Node head = null;
        Node curr1 = n1;
        Node curr2 = n2;

        while (curr1.next != null && curr2.next != null) {
            if (curr1.i > curr2.i) {
                if (head == null) {
                    head = new Node(curr2.i);
                    curr2 = curr2.next;
                } else {
                    head.setNext(new Node(curr2.i));
                    head = head.next;
                    curr2 = curr2.next;
                }
            }

            else {
                if (head == null) {
                    head = new Node(curr1.i);
                    curr1 = curr1.next;
                } else {
                    head.setNext(new Node(curr1.i));
                    head = head.next;
                    curr1 = curr1.next;
                }
            }
        }

        if (curr1.next == null) {
            // Just append the rest of curr2 to the head
            head.setNext(curr2);
        }

        else {
            head.setNext(curr1);
        }

        return head;

    }

    public static void main(String args[]) {
        MergeLinkedList ml = new MergeLinkedList();
        Node n1 = ml.new Node(10);
        Node n2 = ml.new Node(11);
        n1.setNext(n2);
        Node n3 = ml.new Node(13);
        n2.setNext(n3);

        Node n5 = ml.new Node(2);
        Node n6 = ml.new Node(14);
        n5.setNext(n6);
        Node n7 = ml.new Node(20);
        n6.setNext(n7);

        MergeLinkedList lis = new MergeLinkedList();
        Node finalNode = lis.mergeList(n1, n5);

        while (finalNode.next != null) {
            System.out.println(finalNode.i);
            finalNode = finalNode.next;
        }

    }
}
