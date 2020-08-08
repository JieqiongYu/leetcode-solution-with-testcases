package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {

    /**
     * Recursion. 递归三要素。
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        traverse(root, preorder);
        return preorder;
    }

    /**
     * traverse. 要素一：定义：把root为根的preorder加入result里面
     *
     * @param root
     * @param preorder
     */
    private void traverse(TreeNode root, List<Integer> preorder) {
        // 要素三：出口：避免无限制递归
        if (root == null) {
            return;
        }

        // 要素二：拆解
        // 根据定义：Preorder: 根左右
        preorder.add(root.val);
        traverse(root.left, preorder);
        traverse(root.right, preorder);
    }

    /**
     * Non-Recursive. Use Stack do DFS.
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> preorder = new ArrayList<>();

        if (root == null) {
            return preorder;
        }

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            preorder.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return preorder;
    }
}
