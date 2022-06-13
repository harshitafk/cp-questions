class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int n = triangle.size();
        int[][] dp = new int[n+1][n+1];
        
        for(int levels = n-1; levels >= 0; levels--){
            for(int i = 0; i <= levels; i++){
                dp[levels][i] = triangle.get(levels).get(i) + Math.min(dp[levels+1][i+1], dp[levels+1][i]);
            }
        }
        
        return dp[0][0];
    }
}