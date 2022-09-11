class Solution {
    public int maxProfit(int[] prices) {
        int max,ans = 0;
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            
            int diff = prices[i] - min;
            
            if(ans < diff){
                ans = diff;
            }
        }
        
        return ans;
    }
}