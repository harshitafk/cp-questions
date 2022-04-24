class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0;
        int first = nums[0];
        int second = 0;
      
      for(int i = 1; i < nums.length && count < 2; i++){
        if(nums[i] > first){
           second = first;
          first = nums[i];
        }else if(nums[i] > second){
          first = nums[i];
          count++;
        }else{
          count++;
        }
      }
      
      return count < 2;
    }
}