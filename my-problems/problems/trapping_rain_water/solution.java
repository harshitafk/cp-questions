class Solution {
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        
        int left = 0;
        for(int i = 0; i < leftMax.length; i++){
            leftMax[i] = Math.max(height[i],left);
            left = leftMax[i];
        }
        
        int right = 0;
        for(int i = rightMax.length-1; i >= 0; i--){
            rightMax[i] = Math.max(height[i],right);
            right = rightMax[i];
        }
        
        int count = 0;
        
        for(int i = 0; i < height.length; i++){
            count += Math.min(leftMax[i],rightMax[i]) - height[i];
        }
        
        return count;
    }
}