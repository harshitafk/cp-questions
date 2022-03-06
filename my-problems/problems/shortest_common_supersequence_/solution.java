class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        
      int[][] dp = new int[str1.length() + 1][str2.length() + 1];
      
      for(int i = 1; i < str1.length() + 1; i++){
        for(int j = 1; j < str2.length() + 1; j++){
          if(str1.charAt(i-1) == str2.charAt(j-1)){
            dp[i][j] = 1 + dp[i-1][j-1];
          }else{
            dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
          }    
        }
      }
      
      int i = str1.length();
      int j = str2.length();
      
      int outputLength = (i + j) - dp[i][j];
      char[] charArr = new char[outputLength];
      
      while(i > 0 && j > 0){
        if(str1.charAt(i-1) == str2.charAt(j-1)){
          charArr[outputLength-1] = str1.charAt(i-1);
          i--;
          j--;
        }else{
          if(dp[i-1][j] > dp[i][j-1]){
            charArr[outputLength-1] = str1.charAt(i-1);
            i--;
          }else{
            charArr[outputLength-1] = str2.charAt(j-1);
            j--;
          }
        }
        
        outputLength--;
      }
      
      while(i > 0){
        charArr[outputLength-1] = str1.charAt(i-1);
        i--;
        outputLength--;
      }
      
      while(j > 0){
        charArr[outputLength-1] = str2.charAt(j-1);
        j--;
        outputLength--;
      }
      return String.valueOf(charArr);
      
    }
}