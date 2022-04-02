class NumMatrix {

    int[][] dp = null;
    public NumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
      
        dp = new int[r+1][c+1];
      
      dp[1][1] = matrix[0][0];
      for(int i = 1; i < matrix[0].length; i++){
        dp[1][i+1] = matrix[0][i] + dp[1][i];
      }
      
      for(int i = 1; i < matrix.length; i++){
        for(int j = 0; j < matrix[0].length; j++){
          if(j == 0){
          dp[i+1][j+1] = dp[i][j+1] + matrix[i][j];  
          }else{
            dp[i+1][j+1] = matrix[i][j] + dp[i+1][j] + dp[i][j+1] - dp[i][j];
          }
        }
      }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
     
        return dp[row2+1][col2+1] - dp[row1][col2+1] - dp[row2+1][col1] + dp[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */