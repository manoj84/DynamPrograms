package code.binaryTrees;

import code.depthFirstSearch.Node;

public class InorderPreOrdertoBST {

    private int[] inOrder = null;
    private int[] preOrder = null;

    public static void main(String args[]) {
        int[] inOrder = { 4, 2, 5, 1, 6, 3, 7 };
        int[] preOrder = { 1, 2, 4, 5, 3, 6, 7 };
        InorderPreOrdertoBST bst = new InorderPreOrdertoBST();
        bst.construct(inOrder, preOrder);
        System.out.println(bst.searchInOrder(1));
    }

    private void construct(int[] inOrder, int[] preOrder) {
        this.inOrder = inOrder;
        this.preOrder = preOrder;
        // int root = searchInOrder(this.inOrder[pre]);
        // Node rootNode = new Node (root);
        /*
         * rootNode.setLeftNode(new Node(construct(rootNode, );));
         * rootNode.setRightNode(new Node(construct(rootNode);));
         */
    }

    private void constructTree(Node root, int pre, int in) {
        int rootNode = searchInOrder(this.inOrder[pre]);

    }

    public int searchInOrder(int i) {
        int q = -1;
        for (int p = 0; p < inOrder.length; p++) {
            if (inOrder[p] == i) {
                q = p;
            }
        }
        return q;
    }
}
