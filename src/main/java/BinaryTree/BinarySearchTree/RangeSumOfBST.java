package BinaryTree.BinarySearchTree;

import BinaryTree.TreeNode;

public class RangeSumOfBST {
    int answer;

    public int rangeSumBST(TreeNode root, int low, int high) {
        answer = 0;
        dfs(root, low, high);
        return answer;
    }

    private void dfs(TreeNode node, int low, int high) {
        if (node != null) {
            if (node.val >= low && node.val <= high) {
                answer += node.val;
            }

            if (node.val > low) {
                dfs(node.left, low, high);
            }

            if (node.val < high) {
                dfs(node.right, low, high);
            }
        }
    }
}
