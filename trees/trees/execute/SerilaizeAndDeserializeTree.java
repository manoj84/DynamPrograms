package trees.execute;

import java.util.ArrayList;
import java.util.List;

import tree.core.BSTNode;

public class SerilaizeAndDeserializeTree {

    private static List<BSTNode<Integer, String>> list = new ArrayList<>();

    public static void main(String args[]) {
        BSTNode<Integer, String> tree = TreeUtil.getBinarySearchTree();
        SerilaizeAndDeserializeTree store = new SerilaizeAndDeserializeTree();
        store.seriliaze(tree);
        BSTNode<Integer, String> root = store.deSeriliaze();

        // Test
        System.out.println("After serilization   ");
        store.seriliaze(root);
    }

    private void seriliaze(BSTNode<Integer, String> tree) {

        inOrderBST(tree);
        System.out.println(list);
    }

    private BSTNode<Integer, String> deSeriliaze() {
        BSTNode<Integer, String> root = furtherBreak(0, list.size() - 1);
        list.clear();
        return root;

    }

    private BSTNode<Integer, String> furtherBreak(int start, int end) {

        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        BSTNode<Integer, String> root = list.get(mid);
        root.setLeft(furtherBreak(start, mid - 1));
        root.setRight(furtherBreak(mid + 1, end));

        return root;
    }

    private void preOrderBST(BSTNode<Integer, String> tree) {
        if (tree == null)
            return;
        list.add(tree);
        preOrderBST(tree.left());
        preOrderBST(tree.right());
    }

    private void inOrderBST(BSTNode<Integer, String> tree) {
        if (tree == null)
            return;
        inOrderBST(tree.left());
        list.add(tree);
        inOrderBST(tree.right());
    }

}
