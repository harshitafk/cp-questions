class Solution {
     public int getMaxLen(int[] nums) {
      int negativeNumberLength = 0;
      int positiveNumberLength = 0;
      int max = 0;
      
      for(int i = 0; i < nums.length; i++){
        if(nums[i] == 0){
          negativeNumberLength = 0;
          positiveNumberLength = 0;
        }else{
          
          if(negativeNumberLength > 0) negativeNumberLength++;
          positiveNumberLength++;
        
        if(nums[i] < 0){
          int temp = positiveNumberLength;
          positiveNumberLength = negativeNumberLength;
          negativeNumberLength = temp;
        }
        }
        max = Math.max(max,positiveNumberLength);
      }
      
      return max;
    }
}