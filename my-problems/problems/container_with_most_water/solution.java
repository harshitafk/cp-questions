class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
      int area = 0;
      while(i < j){
        if(height[i] > height[j]){
          area = Math.max(Math.min(height[i],height[j]) * (j-i),area);
          j--; 
        }else if(height[i] < height[j]){
          area = Math.max(Math.min(height[i],height[j]) * (j-i),area);
          i++;
        }else{
          area = Math.max(Math.min(height[i],height[j]) * (j-i),area);
          i++;j--;
        }
      }
      return area;
    }
}