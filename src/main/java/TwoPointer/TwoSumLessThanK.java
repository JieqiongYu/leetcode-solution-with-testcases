package TwoPointer;

import java.util.Arrays;

public class TwoSumLessThanK {
    public int twoSumLessThanK(int[] A, int K) {
        int target = -1;
        Arrays.sort(A);
        int low = 0, high = A.length - 1;
        while (low < high) {
            if (A[low] + A[high] < K) {
                target = Math.max(target, A[low] + A[high]);
                low++;
            } else {
                high--;
            }
        }

        return target;
    }
}
