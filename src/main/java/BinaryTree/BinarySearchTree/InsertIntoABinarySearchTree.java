package BinaryTree.BinarySearchTree;

import BinaryTree.TreeNode;

public class InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }

        if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }
}
