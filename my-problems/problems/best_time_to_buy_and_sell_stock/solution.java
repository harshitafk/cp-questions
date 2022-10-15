class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        int diff = 0;
        for(int i = 0; i < prices.length; i++){
            
            if(prices[i] > max){
                max = prices[i];
            }
            
            if(prices[i] < min){
                max = prices[i];
                min = prices[i];
            }
            
            diff = Math.max((max-min),diff);
            
        }
        
        return diff;
    }
}