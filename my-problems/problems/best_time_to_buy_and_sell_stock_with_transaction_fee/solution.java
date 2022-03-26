class Solution {
    public int maxProfit(int[] prices, int fee) {
        int buy = -prices[0], sell = 0;
          
          for(int i = 0; i < prices.length; i++){
            buy = Math.max(buy, sell - prices[i]);
            sell = Math.max(sell, buy + prices[i] - fee);
          }
      
      return sell;
    }
}