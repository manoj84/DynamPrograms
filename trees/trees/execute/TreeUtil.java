package trees.execute;

/**
 *  ==========================================
 *            Binary Tree
 *      =================================   
 *                   6
 *             2        10
 *         1      4        12
 *             3     5   11
 *   ======================================
 *   Check wiki pedia for in order pre order tree traversal for diagram
 * 
 * 
 */

import tree.core.BSTNode;

public final class TreeUtil {

    public static BSTNode<Integer, String> getBinarySearchTree() {

        BSTNode<Integer, String> root = new BSTNode<Integer, String>();
        root.setKey(6);
        root.setElement("F");
        BSTNode<Integer, String> left = new BSTNode<Integer, String>();
        left.setKey(2);
        left.setElement("B");
        root.setLeft(left);
        BSTNode<Integer, String> right = new BSTNode<Integer, String>();
        right.setKey(7);
        right.setElement("G");
        root.setRight(right);

        BSTNode<Integer, String> rootLeft = root.left();
        BSTNode<Integer, String> leftFirst = new BSTNode<Integer, String>();
        leftFirst.setKey(1);
        leftFirst.setElement("A");
        rootLeft.setLeft(leftFirst);
        BSTNode<Integer, String> rightFirst = new BSTNode<Integer, String>();
        rightFirst.setKey(4);
        rightFirst.setElement("D");
        rootLeft.setRight(rightFirst);

        BSTNode<Integer, String> rootLeftRight = rootLeft.right();

        BSTNode<Integer, String> leftThird = new BSTNode<Integer, String>();
        leftThird.setKey(3);
        leftThird.setElement("C");
        rootLeftRight.setLeft(leftThird);

        BSTNode<Integer, String> rightThird = new BSTNode<Integer, String>();
        rightThird.setKey(5);
        rightThird.setElement("E");
        rootLeftRight.setRight(rightThird);

        BSTNode<Integer, String> rootRight = root.right();

        BSTNode<Integer, String> rightSecond = new BSTNode<Integer, String>();
        rightSecond.setKey(12);
        rightSecond.setElement("I");
        right.setRight(rightSecond);

        BSTNode<Integer, String> rootRightRight = rootRight.right();

        BSTNode<Integer, String> leftFourth = new BSTNode<Integer, String>();
        leftFourth.setKey(10);
        leftFourth.setElement("H");
        rightSecond.setLeft(leftFourth);

        return root;

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

}
