package dzone;

import java.util.Stack;

import tree.core.BSTNode;
import trees.execute.TreeUtil;

public class TreeTraversals {

    public static void main(String args[]) {

        BSTNode<Integer, String> node = TreeUtil.getBinarySearchTree();
        System.out.println("Printing Pre Order ");
        preOrder(node);
        System.out.println("Printing Post Order ");
        postOrder(node);
        System.out.println("Printing In Order ");
        inOrder(node);

        System.out.println("Printing Pre Order Iterative ");
        preOrderIterative(node);
        System.out.println("Printing Post Order Iterative ");
        postOrderIterative(node);
        System.out.println("Printing In Order Iterative ");
        inOrderIterative(node);

    }

    private static void preOrderIterative(BSTNode<Integer, String> node) {

        Stack<BSTNode> rightStacks = new Stack<BSTNode>();
        while (node != null || !rightStacks.isEmpty()) {
            if (node != null) {
                System.out.println(node);
                rightStacks.push(node.right());
                node = node.left();
            } else {
                node = rightStacks.pop();
            }
        }

    }

    private static void postOrderIterative(BSTNode<Integer, String> node) {

    }

    private static void inOrderIterative(BSTNode<Integer, String> node) {
        Stack<BSTNode> stack = new Stack<BSTNode>();
        // First go down
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left();
            }

            else {
                node = stack.pop();
                System.out.println(node);
                node = node.right();
            }
        }

    }

    private static void inOrder(BSTNode<Integer, String> node) {
        if (node == null) {
            return;
        }
        inOrder(node.left());
        System.out.println(node);
        inOrder(node.right());
    }

    private static void postOrder(BSTNode<Integer, String> node) {
        if (node == null) {
            return;
        }
        System.out.println(node);
        preOrder(node.right());
        preOrder(node.left());

    }

    private static void preOrder(BSTNode<Integer, String> node) {
        if (node == null) {
            return;
        }
        System.out.println(node);
        preOrder(node.left());
        preOrder(node.right());
    }

}
