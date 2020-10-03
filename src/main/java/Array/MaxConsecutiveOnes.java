package Array;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
        }

        return Math.max(ans, count);
    }
}
