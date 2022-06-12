class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        int sum = 0,ans = Integer.MIN_VALUE;
        int l = 0, r = 0;
        
        while(l < nums.length && r < nums.length){
            if(!set.contains(nums[l])){
                sum += nums[l];
                
                ans = Math.max(sum,ans);
                set.add(nums[l++]);
            }else{
                sum -= nums[r];
                set.remove(nums[r++]);
            }
        }
        
        return ans;
    }
}