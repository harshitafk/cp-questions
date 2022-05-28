class Solution {
    public int specialArray(int[] nums) {
        int s = nums.length;
      int[] arr = new int[s+1];
      
      for(int i : nums){
        if(i > s){
          arr[s]++;
        }else{
          arr[i]++;
        }
      }
      
      int res = 0;
      for(int i = arr.length-1; i > 0; i--){
        res += arr[i];
        
        if(res == i){
          return res;
        }
      }
      
      return -1;
    }
}