class Solution {
    public boolean canPartition(int[] nums) {
             int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		if (sum % 2 != 0) {
			return false;
		} else {
			sum = sum / 2;
			boolean[][] dp = new boolean[sum+1][nums.length + 1];
			return subset(nums, sum, dp);
		}
	}

	public boolean subset(int nums[], int sum, boolean[][] dp) {
		
		for (int i = 0; i <= nums.length; i++)
			dp[0][i] = true;
		
		for (int i = 1; i <= sum; i++)
			dp[i][0] = false;
		
		for (int i = 1; i <= sum; i++) {
			for (int j = 1; j <= nums.length; j++) {
				if(nums[j-1] <= i) {
					dp[i][j] = dp[i-nums[j-1]][j-1] || dp[i][j-1];
				}else {
					dp[i][j] = dp[i][j-1];
				}
			}
		}
		
		return dp[sum][nums.length];
    }
}