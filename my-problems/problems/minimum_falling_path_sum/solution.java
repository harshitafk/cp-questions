class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix.length];
      
      for(int i = 0; i < matrix.length; i++){
        dp[0][i] = matrix[0][i];
      }
      
      for(int i = 1; i < matrix.length; i++){
        for(int j = 0; j < matrix.length; j++){
          if(j == 0){
            dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j],dp[i-1][j+1]);
          }else if(j == matrix.length - 1){
            dp[i][j] = matrix[i][j] + Math.min(dp[i-1][ matrix.length - 2],dp[i-1][ matrix.length - 1]);
          }else{
            dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i-1][j+1]));
          }
        }
      }
      
      Arrays.sort(dp[matrix.length-1]);
      
      return dp[matrix.length-1][0];
    }
}