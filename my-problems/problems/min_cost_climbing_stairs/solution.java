class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
       int n = cost.length;
    return Math.min(calcCost(cost,0,dp),calcCost(cost,1,dp));
    }
    
    public int calcCost(int[] cost,int i,int[] dp){
        
        if(i > cost.length-1) return 0;
        
        if(dp[i] != 0) return dp[i];
        if (i==cost.length-1 || i==cost.length-2) return cost[i];
        dp[i] = cost[i] + Math.min(calcCost(cost,i+1,dp),calcCost(cost,i+2,dp));
        
        return dp[i];
    }
}