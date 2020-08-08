package BinaryTree;

public class PathSum {
    public boolean hasPathSum1(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        sum -= root.val;

        // when it's a leaf
        if ((root.left == null) && (root.right == null)) {
            return (sum == 0);
        }

        // when it's not a leaf
        return hasPathSum1(root.left, sum) || hasPathSum1(root.right, sum);
    }
}
