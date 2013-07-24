package depthFirstSearch;

/**
 * Created with IntelliJ IDEA.
 * User: manoj
 * Date: 5/20/13
 * Time: 8:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class Node {
    private Integer value;
    private Boolean visited = false;
    private Node leftNode;
    private Node rightNode;

    public Node (Integer i){
         this.value = i;
    }

    public void setVisited(Boolean visited){
         this.visited = visited;
    }

    public Boolean getVisited(){
        return this.visited;
    }

    public Integer getValue(){
        return this.value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }
}
