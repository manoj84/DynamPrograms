package code.binaryTrees;

import code.trees.tree.core.BSTNode;
import code.trees.trees.execute.TreeUtil;
import scala.collection.mutable.LinkedList;

import java.util.Stack;

/**
 * Created by mmandam on 9/29/15.
 */
public class VerticalOrder {
    
    private BSTNode<Integer, String> node = null;
    
    public static void main (String args[]) {
        
        BSTNode<Integer, String> root = TreeUtil.getBinarySearchTree();
        VerticalOrder verticalOrder = new VerticalOrder();
        verticalOrder.node = root;
        verticalOrder.compute();
    }

    private void compute() {

        Stack<BSTNode> stack = new Stack<>();
        BSTNode<Integer, String> lastVisitedNode = null;

        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.add(node);
                node = node.left();
            }

            else {

                BSTNode<Integer, String> peekNode = stack.peek();
                if(peekNode.right() != null && lastVisitedNode.element() != peekNode.right().element()) {
                   node = peekNode.right();
                }
                else {
                    if(peekNode.right() == null) System.out.println(stack);
                 lastVisitedNode = stack.pop();
                }


            }
        }
    }

}
