class Solution {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
      
      if(x < 2) return x;
      
      while(left < right){
        int mid = left + ((right - left) / 2);
        
        int temp = x / mid;
        
        if(temp == mid){
          return mid;
        }else if(temp < mid){
          right = mid;
        }else{
          left = mid + 1;
        }
      }
      
      return left - 1;
    }
}