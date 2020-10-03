package TwoPointer;

import java.util.Arrays;

public class KDiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            while (j < nums.length && nums[j] - nums[i] < k) {
                j++;
            }
            if (j < nums.length && nums[j] - nums[i] == k) {
                answer++;
            }
            while (i + 1 < nums.length && nums[i + 1] == nums[i]) {
                i++;
            }
        }

        return answer;
    }
}
