class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        
        int ans = 0;
        for(int i= 0; i < prices.length; i++){
         if(prices[i] < min){
             min = prices[i];
         }
            
         ans = Math.max(ans,prices[i] - min);
        }
        
        return ans;
    }
}