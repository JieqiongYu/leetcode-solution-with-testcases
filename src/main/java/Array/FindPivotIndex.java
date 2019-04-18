package Array;

import com.apple.eawt.AppEvent;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int sumTotal = 0;
        for (int i = 0; i < nums.length; i++) {
            sumTotal += nums[i];
        }

        int sumSoFar = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sumSoFar == sumTotal - nums[i] - sumSoFar) {
                return i;
            }
            sumSoFar += nums[i];
        }
        return -1;
    }
}
