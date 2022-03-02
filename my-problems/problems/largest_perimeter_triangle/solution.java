class Solution {
    public int largestPerimeter(int[] nums) {
      Arrays.sort(nums);  
      for(int i = nums.length-1; i >= 2; i--){
          if(possible(nums[i],nums[i-1],nums[i-2]))
            return nums[i]+nums[i-1]+nums[i-2];
        }
      
      return 0;
    }
  
  private boolean possible(int a, int b, int c){
    if(a+b > c && b+c > a && c+a > b) return true;
    else return false;
  }
}