class Solution {
    public void moveZeroes(int[] nums) {
      int zeroSize = 0;
      
      for(int i = 0; i < nums.length; i++){
        if(nums[i] == 0){
          zeroSize++;
        }else if(zeroSize > 0){
          swap(i,(i - zeroSize),nums);
        }
      }
    }
  
  private void swap(int n,int m,int[] nums){
    int temp = nums[n];
    nums[n] = nums[m];
    nums[m] = temp;
  }
}