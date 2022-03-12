class Solution {
    public int[] sortedSquares(int[] nums) {
      
      int[] ans = new int[nums.length];
      int lo = 0; int hi = nums.length - 1;
      
        for(int i = nums.length - 1; i >= 0; i--){
          
          if((nums[lo] * nums[lo]) >= (nums[hi] * nums[hi])){
            ans[i] = nums[lo] * nums[lo];
            lo++;
          }else{
            ans[i] = nums[hi] * nums[hi];
            hi--;
          }
        }
      
      return ans;
    }
}