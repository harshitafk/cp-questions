class Solution {
    public String longestPalindrome(String s) {
      
      int dp[][] = new int[s.length()][s.length()];
      
      for(int i = 0; i < s.length(); i++){
        dp[i][i] = 1;
      }
      int start = 0,maxLength = 1;
      for(int i = 0; i < s.length()-1; ++i){
        if(s.charAt(i) == s.charAt(i+1)){
          dp[i][i+1] = 1;
          start = i;
          maxLength = 2;
        }else{
          dp[i][i+1] = 0;
        }
      }
      
      
     for (int m = 3; m <= s.length(); m++) {
        for(int i = 0; i < s.length() - m + 1; i++){
          int j = i + m - 1;
          
          if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == 1){
            dp[i][j] = 1;
              if(m > maxLength){
                start = i;
                maxLength = m;
              }
          }else{
            dp[i][j] = 0;
          }
        }
      }
      
      return s.substring(start, start + maxLength);
    }
}