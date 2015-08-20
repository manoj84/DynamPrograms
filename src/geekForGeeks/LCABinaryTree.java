package geekForGeeks;

import code.trees.tree.core.BSTNode;
import code.trees.trees.execute.TreeUtil;

public class LCABinaryTree {

    public static void main(String args[]) {
        BSTNode<Integer, String> node = TreeUtil.getBinarySearchTree();
        LCABinaryTree lcb = new LCABinaryTree();
        System.out.println(lcb.compute(node, 4, 13).key());
    }

    private BSTNode compute(BSTNode<Integer, String> node, int i, int j) {
        if (node == null) {
            return null;
        }

        if (node.key() == i || node.key() == j) {
            return node;
        }

        BSTNode<Integer, String> left = compute(node.left(), i, j);
        BSTNode<Integer, String> right = compute(node.right(), i, j);

        if (left != null && right != null)
            return node;

        else {
            if (left != null) {
                return left;
            }

            else {
                return right;
            }
        }

    }
}