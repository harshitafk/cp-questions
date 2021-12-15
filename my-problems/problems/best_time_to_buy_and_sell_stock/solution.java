class Solution {
    public int maxProfit(int[] prices) {
      int currMax = 0, maxSoFar = 0;
		
		for(int i = 1; i < prices.length; i++) {
			currMax = Math.max(0,currMax += prices[i]-prices[i-1]);
			maxSoFar = Math.max(currMax, maxSoFar);
		}
		return maxSoFar;
    }
}