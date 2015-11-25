package code.crackingCode;

import code.trees.tree.core.BSTNode;
import code.trees.trees.execute.TreeUtil;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by mmandam on 9/18/15.
 */
public class PostOrderIterative {

    Stack<BSTNode> stack = new Stack<BSTNode>();
    Set<String> set = new HashSet<String>();
    private BSTNode<Integer, String> node = null;

    public static void main (String args[]) {
        BSTNode<Integer, String> node = TreeUtil.getBinarySearchTree();
        PostOrderIterative postOrderIterative = new PostOrderIterative();
        postOrderIterative.compute(node);
    }

    private void compute(BSTNode<Integer, String> node) {
        if(node == null) return;

        stack.add(node);

    }
}
