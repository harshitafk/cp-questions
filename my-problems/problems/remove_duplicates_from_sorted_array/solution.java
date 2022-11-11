class Solution {
    public int removeDuplicates(int[] nums) {
        int pi = 0, count = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[pi] < nums[i]){
                ++pi;
                nums[pi] = nums[i];
                count++;
            }
        }
        return count;
    }
}