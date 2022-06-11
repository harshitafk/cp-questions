class Solution {
    public int minOperations(int[] nums, int x) {
        int target = -x;
        
        for(int i : nums) target += i;
        
        if(target == 0) return nums.length;
        
        int count = Integer.MIN_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            
            sum += nums[i];
            
            if(map.containsKey(sum - target)){
                count = Math.max(count, i - map.get(sum - target));
            }
            
            map.put(sum, i);
        }
        
       return count == Integer.MIN_VALUE ? -1 : nums.length - count;
    }
}