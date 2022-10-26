class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
      
      int sum = 0;
      for(int i = 0; i < nums.length; i++){
        sum += nums[i];
        sum %= k;
        
        Integer rem = map.get(sum);
        
        if(rem != null){
          if(i - rem > 1) return true;
        }else{
          map.put(sum,i);
        }
      }
      
      return false;
    }
}