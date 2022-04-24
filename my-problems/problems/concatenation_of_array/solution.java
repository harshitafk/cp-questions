class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[2 * nums.length];
      int mid = (2 * nums.length) / 2;
      for(int i = 0; i < nums.length; i++){
        res[i] = nums[i];
        res[i+mid] = nums[i];
      }
      
      return res;
    }
}