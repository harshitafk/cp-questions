class Solution {
    public int minCut(String s) {
         int[][] dp = new int[s.length()][s.length()];
       if(s.length()==0) return 0;
     return  findMcm(s,dp,0,s.length()-1);
    }
  
  
  private int findMcm(String s,int[][] dp,int i,int j){
    if(i >= j){
       return 0;
    }
     if(dp[i][j] != 0) return dp[i][j];
    
    if(isPalindrome(s,i,j) == true){
      return 0;
    }

     int min = Integer.MAX_VALUE;
    
    for(int k = i; k <= j-1; k++){
     
      if(isPalindrome(s, i , k)){
         int temp1 =  findMcm(s,dp,k+1,j) + 1;
         if(temp1 < min){
        min = temp1;
      }
      }
     
      
      dp[i][j] = min;
    }
    
    return min;  
  }
  
  boolean isPalindrome(String s,int i,int j){
    if(i >= j) return true;
    
    while(i < j){
      if(s.charAt(i) != s.charAt(j)){
        return false;
      }
      i++;
      j--;
    }
    
    return true;
  }
}