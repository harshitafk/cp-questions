class Solution {
    public int maxProfit(int[] prices) {
    
      int[][] dp = new int[prices.length+1][2];
      
      return calculateMaxProfit(0,0,prices,dp);
      
    }
  
  private int calculateMaxProfit(int i, int buyOrSell, int[] prices, int[][] dp){
    if(i >= prices.length) return 0;
    
    if(dp[i+1][buyOrSell] != 0) return dp[i+1][buyOrSell];
    
    int x = 0;
    if(buyOrSell == 0){
      int buy = calculateMaxProfit(i + 1,1,prices,dp) - prices[i];
      int noBuy = calculateMaxProfit(i + 1, 0, prices, dp);
      
      x = Math.max(buy,noBuy);
    }else{
      int sell =  calculateMaxProfit(i + 2,0,prices,dp) + prices[i];
      int noSell =  calculateMaxProfit(i + 1,1,prices,dp);
      
      x = Math.max(sell,noSell);
    }
    
    dp[i+1][buyOrSell] = x;
    
    return x;
  }
}