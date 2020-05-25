class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
      int[][] dp = new int[2][B.length + 1];
        
        int flag = 1;
        for(int i = A.length - 1; i >= 0; i--){
            for(int j = B.length - 1; j >= 0; j--){
                dp[flag][j] = (A[i] == B[j] 
                                ? dp[flag ^ 1][j + 1] + 1 
                                : Math.max(dp[flag][j + 1], dp[flag ^ 1][j]));
            }
            flag ^= 1;
        }
        
        return dp[flag ^ 1][0];   
    }
}

// Second APproach

class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        //https://www.youtube.com/watch?v=x_djkQhnuTk
        int m=A.length, n=B.length;
        if (m==0 || n==0)   return 0;
        int[][]dp = new int[m+1][n+1];
        
        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                if (A[i-1]==B[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
}


