package trees.execute;

/**
 *  ==========================================
 *            Binary Tree
 *      =================================   
 *                     6 node1
 *             4 node2        10 node3
 *        2 node4      5 node5        12 node6
 * 1 node7     3 node8             11 node9   13 node10
 *   ======================================
 *   Check wiki pedia for in order pre order tree traversal for diagram
 * 
 * 
 */

import tree.core.BSTNode;

public final class TreeUtil {

    public static BSTNode<Integer, String> getBinarySearchTree() {

        BSTNode<Integer, String> node1 = new BSTNode<Integer, String>();
        node1.setKey(6);
        node1.setElement("F");
        BSTNode<Integer, String> node2 = new BSTNode<Integer, String>();
        node2.setKey(4);
        node2.setElement("B");
        node1.setLeft(node2);

        BSTNode<Integer, String> node3 = new BSTNode<Integer, String>();
        node3.setKey(10);
        node3.setElement("G");
        node1.setRight(node3);

        BSTNode<Integer, String> node4 = new BSTNode<Integer, String>();
        node4.setKey(2);
        node4.setElement("A");
        node2.setLeft(node4);

        BSTNode<Integer, String> node5 = new BSTNode<Integer, String>();
        node5.setKey(5);
        node5.setElement("D");
        node2.setRight(node5);

        BSTNode<Integer, String> node7 = new BSTNode<Integer, String>();
        node7.setKey(1);
        node7.setElement("C");
        node4.setLeft(node7);

        BSTNode<Integer, String> node8 = new BSTNode<Integer, String>();
        node8.setKey(3);
        node8.setElement("C");
        node4.setRight(node8);

        BSTNode<Integer, String> node6 = new BSTNode<Integer, String>();
        node6.setKey(12);
        node6.setElement("I");
        node3.setRight(node6);

        BSTNode<Integer, String> node9 = new BSTNode<Integer, String>();
        node9.setKey(11);
        node9.setElement("E");
        node6.setLeft(node9);

        BSTNode<Integer, String> node10 = new BSTNode<Integer, String>();
        node10.setKey(13);
        node10.setElement("H");
        node6.setRight(node10);

        return node1;

    }

    public static BSTNode<Integer, String> getUnBalancedTree() {

        BSTNode<Integer, String> root = new BSTNode<Integer, String>();
        root.setKey(6);
        BSTNode<Integer, String> firstLeft = new BSTNode<Integer, String>();
        firstLeft.setKey(3);
        root.setLeft(firstLeft);
        BSTNode<Integer, String> firstRight = new BSTNode<Integer, String>();
        firstRight.setKey(10);
        root.setRight(firstRight);

        BSTNode<Integer, String> secondLeft = new BSTNode<Integer, String>();
        firstLeft.setLeft(secondLeft);
        BSTNode<Integer, String> thirdLeft = new BSTNode<Integer, String>();
        secondLeft.setLeft(thirdLeft);

        return root;

    }

    public static BSTNode<Integer, String> getTwoWayTree() {

        BSTNode<Integer, String> node1 = new BSTNode<Integer, String>();
        node1.setKey(6);
        node1.setElement("F");

        BSTNode<Integer, String> node2 = new BSTNode<Integer, String>();
        node2.setKey(4);
        node2.setElement("B");
        node1.setLeft(node2);
        node2.setParent(node1);

        BSTNode<Integer, String> node3 = new BSTNode<Integer, String>();
        node3.setKey(10);
        node3.setElement("G");
        node1.setRight(node3);
        node3.setParent(node1);

        BSTNode<Integer, String> node4 = new BSTNode<Integer, String>();
        node4.setKey(2);
        node4.setElement("A");
        node2.setLeft(node4);
        node4.setParent(node2);

        BSTNode<Integer, String> node5 = new BSTNode<Integer, String>();
        node5.setParent(node2);
        node5.setKey(5);
        node5.setElement("D");
        node2.setRight(node5);

        BSTNode<Integer, String> node7 = new BSTNode<Integer, String>();
        node7.setKey(1);
        node7.setElement("C");
        node4.setLeft(node7);
        node7.setParent(node4);

        BSTNode<Integer, String> node8 = new BSTNode<Integer, String>();
        node8.setKey(3);
        node8.setElement("C");
        node4.setRight(node8);
        node8.setParent(node4);

        BSTNode<Integer, String> node6 = new BSTNode<Integer, String>();
        node6.setKey(12);
        node6.setElement("I");
        node3.setRight(node6);
        node6.setParent(node3);

        BSTNode<Integer, String> node9 = new BSTNode<Integer, String>();
        node9.setKey(11);
        node9.setElement("E");
        node6.setLeft(node9);
        node9.setParent(node6);

        BSTNode<Integer, String> node10 = new BSTNode<Integer, String>();
        node10.setKey(13);
        node10.setElement("H");
        node6.setRight(node10);
        node10.setParent(node6);

        return node1;

    }

    public static void inOrder(BSTNode<Integer, String> node) {
        if (node == null) {
            return;
        }

        inOrder(node.left());
        System.out.print(node.key() + " ");
        inOrder(node.right());
    }

    public static void main(String args[]) {
        BSTNode<Integer, String> node = getBinarySearchTree();
        inOrder(node);
    }

}
