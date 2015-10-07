package code.binaryTrees;

import code.trees.tree.core.BSTNode;
import code.trees.trees.execute.TreeUtil;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by mmandam on 10/1/15.
 */
public class DiagnalSum {

    public static void main (String args[]) {
        DiagnalSum diagnalSum = new DiagnalSum();
        BSTNode<Integer, String> node = TreeUtil.getBinarySearchTree();

        diagnalSum.compute(node);

    }

    private void compute(BSTNode<Integer, String> node) {
        Queue<BSTNode> q = new LinkedList<>();

        q.add(node);

        while(!q.isEmpty()) {
            BSTNode<Integer, String> rootNode = q.poll();

            BSTNode<Integer, String> leftNode = rootNode.left();
            BSTNode<Integer, String> rightNode = rootNode.right();

            while(leftNode != null) {
                q.add(leftNode.right());
                leftNode = leftNode.right();
            }

            while(leftNode != null) {
                q.add(leftNode.right());
                leftNode = leftNode.right();
            }
        }



      }
    }


