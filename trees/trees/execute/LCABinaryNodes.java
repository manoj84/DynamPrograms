package trees.execute;

import tree.core.BSTNode;

/**
 * Given values of two nodes in a Binary Search Tree, write a c program to find
 * the Lowest Common Ancestor (LCA). You may assume that both the values exist
 * in the tree.
 * 
 * @author manoj
 * 
 */
public class LCABinaryNodes {

    public static void main(String args[]) {

        LCABinaryNodes lcbnBinaryNodes = new LCABinaryNodes();
        BSTNode<Integer, String> tree = TreeUtil.getBinarySearchTree();

        BSTNode<Integer, String> node1 = new BSTNode<Integer, String>(4, "");
        BSTNode<Integer, String> node2 = new BSTNode<Integer, String>(12, "");

        lcbnBinaryNodes.findLCA(tree, node1, node2);

    }

    private void findLCA(BSTNode<Integer, String> root,
            BSTNode<Integer, String> node1, BSTNode<Integer, String> node2) {

    }

}
