class Solution {
    public int lastStoneWeightII(int[] stones) {
        int size = stones.length;
       int total = 0;
       for(int stone : stones) total += stone;
      
      boolean[] dp = new boolean[total/2 + 1];
      dp[0] = true;
      int max = 0;
      for(int stone : stones){
        boolean[] temp = dp.clone();
        
        for(int i = stone; i <= total/2; i++){
          if(dp[i -stone]){
            temp[i] = true;
            max = Math.max(max,i);
            
            if(max == total/2) return total - max*2;
          }
        }
        dp = temp;
      }
      
      return total - max * 2;
    }
}