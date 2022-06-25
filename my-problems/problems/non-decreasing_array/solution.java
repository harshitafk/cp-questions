class Solution {
    public boolean checkPossibility(int[] nums) {
      int mod = 0;
      
      for(int i = 1; i < nums.length; i++){
        
        if(nums[i-1] > nums[i]) mod++;
        
        if(i > 1 && i < nums.length-1){
          if(nums[i-2] > nums[i] && nums[i-1] > nums[i+1]) return false;
        }
        
        if(mod > 1) return false;
      }
      
      return true;
    }
}