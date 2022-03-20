class Solution {
    public int rob(int[] nums) {
         if(nums.length == 0) return 0;
      
      if(nums.length == 1) return nums[0];
      
      if(nums.length == 2) return Math.max(nums[0],nums[1]);
      
      return Math.max(max1(nums, new int[nums.length]), max2(nums, new int[nums.length]));
     
    }
  
  private int max1(int[] nums,int[] dp){
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0],nums[1]);
     for(int i = 2; i < nums.length-1; i++){
        int val = nums[i];
        dp[i] = Math.max(dp[i-1],dp[i-2] + val);
      }
    
    return dp[nums.length - 2];
  }
  
  private int max2(int[] nums,int[] dp){
    dp[1] = nums[1];
     for(int i = 2; i < nums.length; i++){
        int val = nums[i];
        dp[i] = Math.max(dp[i-1],dp[i-2] + val);
      }
    
    return dp[nums.length - 1];
  }
}