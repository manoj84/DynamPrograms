package dzone;

public class CustomNode {

    private String vString = null;

    public boolean hasNext() {
        if (nextNode != null)
            return true;
        else
            return false;
    }

    public String getValue() {
        return this.vString;
    }

    public CustomNode(String value) {
        this.vString = value;
    }

    private CustomNode nextNode = null;

    public CustomNode getNext() {
        return this.nextNode;
    }

    public void setNode(CustomNode node) {
        this.nextNode = node;
    }

}
