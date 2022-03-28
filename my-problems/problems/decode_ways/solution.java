class Solution {
    public int numDecodings(String s) {
        int n = s.length();
      Integer[] dp = new Integer[n];
      return s.length() == 0 ? 0 : findWays(n,0,s,dp);
    }
  
  private int findWays(int n, int i, String s, Integer[] dp){
    
    if(n == i) return 1;
    if(s.charAt(i) == '0') return 0;
    if(dp[i] != null) return dp[i];
    
    int res = findWays(n,i+1,s,dp);
    
    if(i < n-1 && (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) < '7'))){
       res += findWays(n,i+2,s,dp);
  }
    
  return dp[i] = res;
  }
}