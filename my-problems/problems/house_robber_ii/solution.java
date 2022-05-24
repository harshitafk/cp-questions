class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 1) return nums[0];
        
        return Math.max(rob(nums,0,nums.length-1),rob(nums,1,nums.length));
    }
    
     public int rob(int[] nums,int l, int r) {
        //int[] dp = new int[nums.length + 1];
         
         int curr = 0,prev = 0;
        
        for(int i = l; i < r; i++){
            int t = curr;
            curr = Math.max(prev + nums[i], curr);
            prev = t;
        }
        
        return curr;
    }
}