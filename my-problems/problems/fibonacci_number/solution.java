class Solution {
    public int fib(int n) {
      int[] dp = new int[n+1];
       return fibonacci(n,dp);
    }
  
  private int fibonacci(int n, int[] dp){
        if(n <= 0) return 0;
	      if(n == 1) return 1;
	      dp[n] = fib(n-1) + fib(n-2);
    
       return dp[n];
  }
}