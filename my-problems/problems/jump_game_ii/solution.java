class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
      
      dp[0] = 0;
      for(int i = 1; i < nums.length; i++){
        dp[i] = Integer.MAX_VALUE;
      }
      
      for(int i = 0; i < nums.length; i++){
        for(int j = i; j <= nums[i] + i && j < nums.length; j++){
          dp[j] = Math.min(dp[i]+1,dp[j]);
        }
      }
      
      return dp[nums.length - 1];
    }
}