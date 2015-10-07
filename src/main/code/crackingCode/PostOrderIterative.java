package code.crackingCode;

import code.depthFirstSearch.Node;
import code.trees.tree.core.BSTNode;
import code.trees.trees.execute.TreeUtil;
import com.sun.prism.impl.ps.TessRoundRectRep;
import javafx.geometry.Pos;

import java.util.*;
import java.util.concurrent.TransferQueue;

/**
 * Created by mmandam on 9/18/15.
 */
public class PostOrderIterative {

    private BSTNode<Integer, String> node = null;
    Stack<BSTNode> stack = new Stack<BSTNode>();
    Set<String> set = new HashSet<String>();

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
