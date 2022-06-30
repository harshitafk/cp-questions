class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        
        int mid = nums[nums.length/2], operation = 0;
        for(int num : nums){
            operation += Math.abs(num - mid);
        }
        
        return operation;
    }
}