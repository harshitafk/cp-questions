class Solution {
    public int maxArea(int[] height) {
     int right = (height.length)-1,left = 0,maxArea = 0;
		
		while(left < right) {
			int area = Math.min(height[left], height[right]) * (right - left);
			
			if(area > maxArea) {
				maxArea = area;
			}
			
			if(height[left] < height[right]) {
				left++;
			}else {
				right--;
			}
		}
		
		return maxArea;
    }
}