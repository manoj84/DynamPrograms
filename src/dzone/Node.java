package dzone;

public class Node {
    int value = 0;
    Node nextNode = null;

    public Node(Integer value, Node nextNode) {
        this.setValue(value);
        this.setNextNode(nextNode);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
