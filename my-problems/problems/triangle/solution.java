class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
	        int size = triangle.size();
	      
	      int[][] dp = new int[size][size];
	      
	      for(int i = 0; i < triangle.get(triangle.size()-1).size(); i++) {
	    	  dp[0][i] = triangle.get(triangle.size()-1).get(i);
	      }
	      
	      for(int i = size-2,k=1; i >= 0; k++,i--){
	        for(int j = 0; j < triangle.get(i).size(); j++){
	        	  dp[k][j] = triangle.get(i).get(j) + Math.min(dp[k-1][j],dp[k-1][j+1]);  
	          }
	        }
	      
	      return dp[size-1][0];
	      }
}