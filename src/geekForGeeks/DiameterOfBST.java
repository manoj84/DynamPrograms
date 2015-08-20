package geekForGeeks;

import code.trees.tree.core.BSTNode;
import code.trees.trees.execute.TreeUtil;

public class DiameterOfBST {

    public static void main(String args[]) {

        BSTNode<Integer, String> node = TreeUtil.getTwoWayTree();
        System.out.println(calculateHeight(node));
    }

    private static int calculateHeight(BSTNode<Integer, String> node) {
        // TODO Auto-generated method stub
        if (node == null) {
            return 0;
        }

        return (1 + Math.max(calculateHeight(node.left()),
                calculateHeight(node.right())));
    }
}
