package Greedy;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0], maxSum = nums[0];

        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
