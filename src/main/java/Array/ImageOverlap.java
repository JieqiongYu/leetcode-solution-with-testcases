package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ImageOverlap {
    public int largestOverlap(int[][] A, int[][] B) {
        int row = A.length;
        int col = A[0].length;
        // two lists to save pixel coordinates
        List<int[]> la = new ArrayList<>();
        List<int[]> lb = new ArrayList<>();

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                // save the pixel coordinates
                if (A[r][c] == 1) la.add(new int[]{r, c});
                if (B[r][c] == 1) lb.add(new int[]{r, c});
            }
        }

        // map to map the vector (from a pixel in A to a pixel in B) to its count
        HashMap<String, Integer> map = new HashMap<>();

        for (int[] pa : la) {
            for (int[] pb : lb) {
                String s = (pa[0] - pb[0]) + " " + (pa[1] - pb[1]); // get the vector from pixel in A to a pixel in B.
                map.put(s, map.getOrDefault(s, 0) + 1); // count the number of same vectors
            }
        }

        int max = 0;
        for (int count : map.values()) {
            max = Math.max(count, max);
        }

        return max;
    }
}
