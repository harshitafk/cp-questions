class Solution {
    public int minDistance(String word1, String word2) {
         int word1length = word1.length();
        int word2length = word2.length();
        
        int[][] dp = new int[word1length + 1][word2length + 1];
        
        for(int i = 1; i < word1length + 1; i++){
            for(int j = 1; j < word2length + 1; j++){
            if(word1.charAt(i-1) == word2.charAt(j-1)){
                dp[i][j] = 1 + dp[i-1][j-1];
            }else{
                dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
            }
          }
        }
        
        return (word1length - dp[word1length][word2length]) + (word2length - dp[word1length][word2length]);
    }
}