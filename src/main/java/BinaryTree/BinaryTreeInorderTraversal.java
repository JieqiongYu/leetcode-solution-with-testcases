package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        if (root == null) {
            return inorder;
        }

        dfs(root, inorder);
        return inorder;
    }

    private void dfs(TreeNode root, List<Integer> inorder) {
        if (root == null) {
            return;
        }

        dfs(root.left, inorder);
        inorder.add(root.val);
        dfs(root.right, inorder);
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> inorder = new ArrayList<>();
        TreeNode curt = root;

        while (curt != null || !stack.isEmpty()) {
            while (curt != null) {
                stack.push(curt);
                curt = curt.left;
            }
            curt = stack.pop();
            inorder.add(curt.val);
            curt = curt.right;
        }

        return inorder;
    }
}
