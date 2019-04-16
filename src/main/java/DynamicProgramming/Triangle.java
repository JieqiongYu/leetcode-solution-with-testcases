package DynamicProgramming;

import java.util.*;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        // state: dp[x] = minimum path value from xth level to bottom, dp[0] means the top level to bottom
        int n = triangle.size();
        int[] dp = new int[n];

        // initialize: from the bottom level, the minimum of the pathsum is the number itself on the bottom level
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n-1).get(i);
        }

        // bottom up
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
            }
        }

        return dp[0];
    }
}
