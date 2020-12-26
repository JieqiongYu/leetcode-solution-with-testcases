package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class FindNearestRightNodeInBinaryTree {
    public TreeNode findNearestRightNode(TreeNode root, TreeNode u) {
        // empty input scenario
        if (root == null) {
            return null;
        }

        // data structure used for BFS is queue
        Queue<TreeNode> queue = new LinkedList<>();
        // starting point for BFS is root
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                // pop out the node from the queue.
                TreeNode node = queue.poll();
                // business logic related to this problem: find the given node
                if (node.equals(u)) {
                    // check if it's the rightmost node in this level
                    if (i == levelSize - 1) {
                        return null;
                    }
                    return queue.poll();
                }

                // iterate the tree to add nodes in the queue
                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return null;
    }
}
