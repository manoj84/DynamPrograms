package geekForGeeks;

import tree.core.BSTNode;
import trees.execute.TreeUtil;

public class KthLargestInBinartTree {
    private static int counter = 0;

    public static void main(String args[]) {

        BSTNode<Integer, String> root = TreeUtil.getBinarySearchTree();
        printInorder(root);
        System.out.println(" ");
        KthLargestInBinartTree ktree = new KthLargestInBinartTree();
        ktree.compute(root, 6);

    }

    private void compute(BSTNode<Integer, String> root, int i) {
        if (root == null || counter >= i) {
            return;
        }

        compute(root.left(), i);

        if (counter < i) {
            counter++;
        }

        if (counter == i) {
            System.out.println("Kthe largest is " + root.key());
            counter++;
            return;

        }

        compute(root.right(), i);

    }

    private static void printInorder(BSTNode<Integer, String> root) {
        if (root == null)
            return;
        printInorder(root.left());
        System.out.print(root.key());
        printInorder(root.right());

    }

}
