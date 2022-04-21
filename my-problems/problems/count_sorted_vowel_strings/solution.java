class Solution {
    public int countVowelStrings(int n) {
      int[] dp = new int[5];
      
       int sum = 1;
      for(int i = 0; i <= n; i++){
        dp[4] = 1;
        for(int j =3; j >= 0; j--){
          dp[j] = dp[j] + dp[j+1];
          sum += dp[j];
        }
      }
      
      return dp[0];
    }
}