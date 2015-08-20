package dzone;

import code.trees.tree.core.BSTNode;

public class SortedArrayToBinaryTree {

    public static void main(String args[]) {
        int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        SortedArrayToBinaryTree sortedArrayToBinaryTree = new SortedArrayToBinaryTree();
        BSTNode<Integer, String> newRoot = sortedArrayToBinaryTree
                .buildTree(sortedArray);
        System.out.println(newRoot.key());

    }

    private BSTNode<Integer, String> buildTree(int[] sortedArray) {

        BSTNode<Integer, String> rootNode = new BSTNode<>();
        rootNode.setKey(sortedArray[sortedArray.length / 2]);

        rootNode.setLeft(buildSubTree(sortedArray, rootNode, 0,
                (sortedArray.length / 2) - 1));
        rootNode.setRight(buildSubTree(sortedArray, rootNode,
                (sortedArray.length / 2 + 1), sortedArray.length));

        return rootNode;

    }

    private BSTNode<Integer, String> buildSubTree(int[] sortedArray,
            BSTNode<Integer, String> root, int start, int end) {
        if (start > end || start == end)
            return null;

        else if (end == 0 || end < 0)
            return null;

        else if (start == sortedArray.length || start > sortedArray.length)
            return null;

        int mid = (start + end) / 2;

        BSTNode<Integer, String> newRoot = new BSTNode<>();

        newRoot.setKey(sortedArray[mid]);

        newRoot.setLeft(buildSubTree(sortedArray, newRoot, start, mid - 1));
        newRoot.setRight(buildSubTree(sortedArray, newRoot, mid + 1,
                sortedArray.length));
        return newRoot;

    }
}
