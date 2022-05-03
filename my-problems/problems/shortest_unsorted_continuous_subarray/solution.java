class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int left = -1, right = -2;
        int min = nums[n - 1], max = nums[0];
      
      for(int i = 1; i < nums.length; i++){
        max = Math.max(nums[i],max);
        min = Math.min(nums[n - i -1],min);
        
        if(nums[i] < max) right = i;
        if(nums[n - 1 - i] > min) left = n - i - 1;
      }
      
      return right - left + 1;
    }
}