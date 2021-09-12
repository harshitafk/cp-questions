class Solution {
    public boolean isPowerOfTwo(int n) {        
        int count = 0;
        if(n <= 0)
            return false;
        
      return ((n & (n-1))==0) ? true : false; 
    }
}