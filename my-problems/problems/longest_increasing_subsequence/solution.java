class Solution {
    public int lengthOfLIS(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i = 0; i < nums.length; i++){
        Integer val = set.ceiling(nums[i]);
            
        if(val != null){
         set.remove(val);   
        }
            
        set.add(nums[i]);
        
        }
        
        return set.size();
    }
}