 class Solution {
   public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if (m == 0) {
            return n;
        }
        if (n == 0) {
            return m;
        }
        int[][] dp = new int[2][n + 1];
        for (int i = 1; i <= n; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= m; i++) {
            dp[1][0] = i;
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[1][j] = dp[0][j - 1];
                } else {
                    //dp[i][j] = Min(delete,add,change) + 1
                    dp[1][j] = Math.min(dp[0][j], Math.min(dp[0][j - 1], dp[1][j - 1])) + 1;
                }
            }
            System.arraycopy(dp[1],0,dp[0],0,n+1);
        }
        return dp[1][n];
    }

}
