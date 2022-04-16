class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
     Arrays.sort(nums);
	      
	      int[] dp = new int[nums.length];
	      int max = 1;
	      
	      dp[0] = 1;
	      for(int i = 1; i < nums.length; i++){
	    	  dp[i] = 1;
	        for(int j =  0; j < i; j++){
	          if(nums[i] % nums[j] == 0){
	            dp[i] = Math.max(dp[i],dp[j] + 1);
	          }
	        }
	        
	        max = Math.max(max,dp[i]);
	      }
	      
	      List<Integer> list = new ArrayList<>();
	      for(int i = dp.length-1; i >= 0; i--){
	        if(dp[i] == max){
	          if(list.isEmpty()){
	             max--;
	          list.add(nums[i]);  
	          }else if(list.get(list.size()-1) % nums[i] == 0){
	            list.add(nums[i]);
	             max--;
	          } 
	        }
	      }
	      
	      return list;
    }
}