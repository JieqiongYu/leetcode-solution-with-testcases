package DepthFirstSearch.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();

        dfs(candidates, 0, result, combination, 0, target);

        return result;
    }

    public void dfs(int[] candidates, int startIndex, List<List<Integer>> result, List<Integer> combination, int sum, int target) {
        if (target == sum) {
            result.add(new ArrayList<>(combination));
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if (sum > target) {
                break;
            }

            combination.add(candidates[i]);
            dfs(candidates, i, result, combination, sum + candidates[i], target);
            combination.remove(combination.size() - 1);
        }
    }
}
