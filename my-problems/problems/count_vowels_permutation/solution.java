class Solution {
    public int countVowelPermutation(int n) {
        long mod = 1000000000l + 7;
        
        long[][] dp = new long[5][2];
        
        for(int i = 0; i < dp.length; i++){
            dp[i][0] = 1;
            dp[i][1] = 1;
        }
        
        for(int i = 2; i <= n; i++){
            dp[0][1] = (dp[1][0] + dp[2][0] + dp[4][0])%mod;
            dp[1][1] = (dp[0][0] + dp[2][0])%mod;
            dp[2][1] = (dp[1][0] + dp[3][0])%mod;
            dp[3][1] = (dp[2][0])%mod;
            dp[4][1] = (dp[3][0] + dp[2][0])%mod;
            
            dp[0][0] = dp[0][1];
            dp[1][0] = dp[1][1];
            dp[2][0] = dp[2][1];
            dp[3][0] = dp[3][1];
            dp[4][0] = dp[4][1];
        }
        
        return (int) ((dp[0][1] + dp[1][1] + dp[2][1] + dp[3][1] + dp[4][1]) % mod);
    }
}