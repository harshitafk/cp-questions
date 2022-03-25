class Solution {
    public int maxProfit(int[] prices) {
      if(prices.length == 0) return 0;
      
      int lastBuy = -prices[0]; //If you are buying first time then you have to take debt of same amount and buy it,so your 
                                // actual current balance is in negative.
      int lastSold = 0;
      
      for(int i = 0; i < prices.length; i++){
        int currBuy = Math.max(lastBuy, lastSold - prices[i]);
        int currSold = Math.max(lastSold, lastBuy + prices[i]);
        
        lastBuy = currBuy;
        lastSold = currSold;
      }
      
      return lastSold;
    }
}