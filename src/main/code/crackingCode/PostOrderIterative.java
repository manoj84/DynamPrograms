package code.crackingCode;

import code.depthFirstSearch.Node;
import code.trees.tree.core.BSTNode;
import code.trees.trees.execute.TreeUtil;
import com.sun.prism.impl.ps.TessRoundRectRep;
import javafx.geometry.Pos;

import java.util.List;
import java.util.Stack;
import java.util.concurrent.TransferQueue;

/**
 * Created by mmandam on 9/18/15.
 */
public class PostOrderIterative {

    private BSTNode<Integer, String> node = null;
    Stack<BSTNode> stack = new Stack<BSTNode>();

    public static void main (String args[]) {
        BSTNode<Integer, String> node = TreeUtil.getBinarySearchTree();
        PostOrderIterative postOrderIterative = new PostOrderIterative();
        postOrderIterative.compute(node);
    }

    private void compute(BSTNode<Integer, String> node) {
          stack.add(node);

        while(!stack.isEmpty()) {
            BSTNode<Integer, String> first = stack.peek();
            if(first.left() != null) {
                stack.add(first.left());
            }
            if(first.right() != null) {
                stack.add(first.right());
            }
        }
    }
}
