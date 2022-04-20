class Solution {
    public int getMaximumGenerated(int n) {
      
      if(n == 0 || n == 1) return n;
      
      int[] dp = new int[n+1];
        
      dp[0] = 0;dp[1] = 1;
      int max = 1;
      for(int i = 1; (2 * i + 1) <= n; i++){
        dp[i*2] = dp[i];
        dp[i*2 + 1] = dp[i] + dp[i+1];
        max = Math.max(max, dp[i*2 + 1]);
      }
      
      return max;
    }
}