class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
		 System.out.println(mat.length);
	        int[][] dp = new int[mat.length + 1][mat[0].length + 1];
	      
	      for(int i = 0; i < mat.length; i++){
	        for(int j = 0; j < mat[i].length; j++){
	          dp[i+1][j+1] = mat[i][j] + dp[i][j+1] + dp[i+1][j] - dp[i][j];
	        }
	      }
	      
	      for(int i = 0; i < mat.length; i++){
	        for(int j = 0; j <mat[i].length; j++){
	          int r1 = Math.max(0,i - k),c1 = Math.max(0,j - k),r2 = Math.min(mat.length-1,i+k),c2 = Math.min(mat[0].length-1,j+k);
	          
	          mat[i][j] = dp[r2+1][c2+1] - dp[r2+1][c1] - dp[r1][c2+1] + dp[r1][c1];
	        }
	      }
	      
	      return mat;
	    }
}