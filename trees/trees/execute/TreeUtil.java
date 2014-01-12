package trees.execute;

import tree.core.BSTNode;

public final class TreeUtil {

    public static BSTNode<Integer, String> getBinarySearchTree() {

        BSTNode<Integer, String> root = new BSTNode<Integer, String>();
        root.setKey(6);
        BSTNode<Integer, String> left = new BSTNode<Integer, String>();
        left.setKey(3);
        root.setLeft(left);
        BSTNode<Integer, String> right = new BSTNode<Integer, String>();
        right.setKey(10);
        root.setRight(right);

        BSTNode<Integer, String> rootLeft = root.left();
        BSTNode<Integer, String> leftFirst = new BSTNode<Integer, String>();
        leftFirst.setKey(1);
        rootLeft.setLeft(leftFirst);
        BSTNode<Integer, String> rightFirst = new BSTNode<Integer, String>();
        rightFirst.setKey(5);
        rootLeft.setRight(rightFirst);

        BSTNode<Integer, String> rootRight = root.right();
        BSTNode<Integer, String> leftSecond = new BSTNode<Integer, String>();
        leftSecond.setKey(4);
        rootRight.setLeft(leftSecond);
        BSTNode<Integer, String> rightSecond = new BSTNode<Integer, String>();
        rightSecond.setKey(12);
        rootRight.setRight(rightSecond);

        return root;

    }

}
