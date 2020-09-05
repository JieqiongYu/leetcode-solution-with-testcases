package Greedy;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        // using last as a map to store the right most character index in the String S.
        int[] last = new int[26];
        for (int i = 0; i < S.length(); i++) {
            last[S.charAt(i) - 'a'] = i;
        }

        // left is the left most index as the candidate substring,
        // right is the right most index as the candidate substring.
        int left = 0, right = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            right = Math.max(right, last[S.charAt(i) - 'a']);
            if (i == right) {
                ans.add(i - left + 1);
                left = i + 1;
            }
        }

        return ans;
    }
}
