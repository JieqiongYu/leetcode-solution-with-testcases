package Math;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = (nums.length + 1) * nums.length / 2;
        int current = 0;
        for (int num : nums) {
            current += num;
        }

        return sum - current;
    }
}
