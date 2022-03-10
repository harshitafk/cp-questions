class Solution {
    public int arraySign(int[] nums) {
      int oddCount = 0;
        for(int i = 0; i < nums.length; i++){
          if(nums[i] < 0){
            oddCount = oddCount + 1;
          }else if(nums[i] == 0){
            return 0;
          }
        }
      
      if(oddCount % 2 == 0){
        return 1;
      }else{
        return -1;
      }
    }
}