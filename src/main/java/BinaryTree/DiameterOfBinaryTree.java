package BinaryTree;

public class DiameterOfBinaryTree {

    int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        getDepth(root);
        return diameter;
    }

    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = getDepth(root.left);
        int right = getDepth(root.right);
        int current = left + right;
        if (diameter < current) {
            diameter = current;
        }

        return Math.max(left, right) + 1;
    }
}
