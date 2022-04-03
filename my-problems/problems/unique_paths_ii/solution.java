class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
       int[] dp = new int[obstacleGrid[0].length];
      dp[0] = 1;
      
      for(int[] row : obstacleGrid){
        for(int j = 0; j < row.length; j++){
          if(row[j] == 1){
            dp[j] = 0;
          }else if (j > 0){
            dp[j] += dp[j-1];
          }
        }
      }
      
      return dp[obstacleGrid[0].length-1];
    }
}