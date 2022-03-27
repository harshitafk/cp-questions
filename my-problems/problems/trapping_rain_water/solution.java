class Solution {
    public int trap(int[] height) {
      int ans = 0;  
      int[] leftMax = new int[height.length];
      int[] rightMax = new int[height.length];
      leftMax[0] = height[0];
      rightMax[height.length - 1] = height[height.length - 1];
      
      for(int i = 1, j = height.length - 2; i < height.length; ++i,--j){
        leftMax[i] = Math.max(height[i], leftMax[i-1]);
        rightMax[j] = Math.max(height[j], rightMax[j+1]);
      }
      
      for(int i = 1; i < height.length - 1; i++){
        int water = Math.min(leftMax[i - 1],rightMax[i + 1]) - height[i];
        ans += water > 0 ? water : 0;
      }
      
      return ans;
    }
}