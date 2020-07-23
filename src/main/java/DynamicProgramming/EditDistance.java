package DynamicProgramming;

public class EditDistance {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        // if one of the strings is empty
        if (n * m == 0) {
            return n + m;
        }

        // array to store the conversion history
        int[][] dp = new int[n + 1][m + 1];

        // init boundaries: base case
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j < m + 1; j++) {
            dp[0][j] = j;
        }

        // DP compute
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                int delete = dp[i - 1][j];
                int add = dp[i][j - 1];
                int replace = dp[i - 1][j - 1];
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    replace -= 1;
                }
                dp[i][j] = Math.min(delete, Math.min(add, replace)) + 1;
            }
        }

        // goal
        return dp[n][m];
    }
}
