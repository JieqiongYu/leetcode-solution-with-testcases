package Codility;

public class Solution1 {
    public int solution(int[] A) {
        int max = -2;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                boolean isAdjacent = true;

                for (int value : A) {
                    if ((value > A[i] && value < A[j]) || (value < A[i] && value > A[j])) {
                        isAdjacent = false;
                        break;
                    }
                }

                if (isAdjacent) {
                    int distance = j - i;
                    if (distance > max) {
                        max = distance;
                    }
                }
            }
        }

        return max == -2 ? -1 : max;
    }
}
