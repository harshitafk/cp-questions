class Solution {
    public int[] runningSum(int[] nums) {
        
        int i = 0;
        for(int num : nums) {
            if(i != 0){
            nums[i] = nums[i-1] +  num; 
            }
            i++;
        }
        
        return nums;
    }
}