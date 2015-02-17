package dzone;

import tree.core.BSTNode;
import trees.execute.TreeUtil;

public class BalancedBinaryTree {

    public static void main(String args[]) {

        BSTNode<Integer, String> node = TreeUtil.getBinarySearchTree();

        BSTNode<Integer, String> node1 = TreeUtil.getUnBalancedTree();

        checkBalance(node, 0);

        // checkBalance(node1, 0);

    }

    private static int checkBalance(BSTNode<Integer, String> node, int i) {
        if (node != null) {
            i = i + 1;

            int left = checkBalance(node.left(), i);
            int right = checkBalance(node.right(), i);

            if (left - right > 1) {
                System.out.println("Tree not balanced");
            }

            else {
                System.out.println("Tree is balanced");
            }

            return i;

        }

        else {
            return 0;
        }

    }
}
