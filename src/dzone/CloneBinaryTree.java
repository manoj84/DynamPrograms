package dzone;

import code.trees.tree.core.BSTNode;
import code.trees.trees.execute.TreeUtil;

public class CloneBinaryTree {

    public static void main(String args[]) {

        BSTNode<Integer, String> node = TreeUtil.getBinarySearchTree();
        CloneBinaryTree cbt = new CloneBinaryTree();
        BSTNode<Integer, String> clone = cbt.cloneTree(node);
        cbt.inOrderTraverse(clone);

    }

    private void inOrderTraverse(BSTNode<Integer, String> clone) {
        if (clone == null) {
            return;
        }

        inOrderTraverse(clone.left());
        System.out.println(clone.key());
        inOrderTraverse(clone.right());

    }

    private BSTNode<Integer, String> cloneTree(BSTNode<Integer, String> node) {

        BSTNode<Integer, String> root = new BSTNode<Integer, String>();
        root.setKey(node.key());
        root.setElement(node.element());

        // Left Node
        BSTNode<Integer, String> left = node.left();
        BSTNode<Integer, String> right = node.right();

        if (left != null) {
            root.setLeft(left);
            cloneTree(left);
        }

        if (right != null) {
            root.setRight(right);
            cloneTree(right);
        }

        return root;

    }

}
