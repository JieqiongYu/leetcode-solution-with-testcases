package Array;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEvenDigit(nums[i])) {
                ans++;
            }
        }

        return ans;
    }

    public boolean isEvenDigit(int num) {
        int digit = 0;

        while (num > 0) {
            num = num / 10;
            digit++;
        }

        return digit % 2 == 0;
    }
}
