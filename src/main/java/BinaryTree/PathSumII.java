package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> candidate = new ArrayList<>();
        dfs(root, sum, answer, candidate);
        return answer;
    }

    private void dfs(TreeNode root, int sum, List<List<Integer>> answer, List<Integer> candidate) {
        if (root == null) {
            return;
        }

        sum -= root.val;

        if (root.left == null && root.right == null) {
            if (sum == 0) {
                candidate.add(root.val);
                answer.add(new ArrayList<>(candidate));
                // backtracking
                candidate.remove(candidate.size() - 1);
            }
            return;
        }

        candidate.add(root.val);
        dfs(root.left, sum, answer, candidate);
        dfs(root.right, sum, answer, candidate);
        // backtracking
        candidate.remove(candidate.size() - 1);
    }
}

