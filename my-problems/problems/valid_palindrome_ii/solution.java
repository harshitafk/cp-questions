class Solution {
    public boolean validPalindrome(String s) {
      
      int i = 0,j = s.length() - 1;
      
      while(i < j){
        if(s.charAt(i) == s.charAt(j)){
          i++; j --;
        }else{
          return (checkPalindrome(s,i+1,j) || checkPalindrome(s,i,j-1));
        }
      }
      
      return true;
    }
  
  private boolean checkPalindrome(String s, int i,int j){
    while(i < j){
      if(s.charAt(i) != s.charAt(j)){
        return false;
      }
      i++;j--;
    }
    
    return true;
  }
}