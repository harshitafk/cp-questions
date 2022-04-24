class Solution {
    public int[] buildArray(int[] nums) {  //a = a + q*b
        int q = nums.length;
      
      for(int i = 0; i < nums.length; i++){
        nums[i] = nums[i] + q * (nums[nums[i]] % q);
      }
      
      for(int i = 0; i < nums.length; i++){
        nums[i] = nums[i] / q;
      }
      
      return nums;
    }
}