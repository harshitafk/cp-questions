class Solution {
    public int findDuplicate(int[] nums) {
        for(int n : nums){
            n = Math.abs(n);
            if(nums[n] < 0){
                return n;
            }
            nums[n] =- nums[n];
        }
        return nums.length;
    }
}