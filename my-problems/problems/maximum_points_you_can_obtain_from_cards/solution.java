class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int l = cardPoints.length;
      
      int sum = 0;
      
      for(int i = 0; i < k; i++){
        sum += cardPoints[i];
      }
      
      int max = sum;
      
      for(int i = 0; i < k; i++){
        sum = sum - cardPoints[k - i - 1] + cardPoints[l - i - 1];
        
        max = Math.max(max,sum);
      }
      
      return max;
    }
}