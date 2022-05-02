class Solution {
    public int[] sortArrayByParity(int[] nums) {
      
      int j = 0,k = nums.length-1;
      int[] res = new int[k+1];
      
      
      for(int i = 0; i < nums.length; i++){
        if(nums[i] % 2 == 0){
          res[j] = nums[i];
          j++;
        }else{
          res[k] = nums[i];
          k--;
        }
      }
      
      return res;
    }
}