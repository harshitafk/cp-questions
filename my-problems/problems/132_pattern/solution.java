class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
	        if(n < 3) return false;
	      
	      TreeMap<Integer,Integer> map = new TreeMap<>();
	      
	      for(int i = 1; i < n; i++) {
	    	  map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
	      }
	      
	      
	      int min = Integer.MAX_VALUE;
	      
	      for(int i = 1; i < n; i++) {
	    	  min = Math.min(min, nums[i-1]);
	    	  
	    	  int count = map.get(nums[i]);
	    	  if(count == 1) {
	    		  map.remove(nums[i]);
	    	  }else {
	    		  map.put(nums[i], count - 1);
	    	  }
	    	  
	    	  if(nums[i] < min) {
	    		  continue;
	    	  }
	    	  
	    	  Integer key = map.higherKey(min);
	    	  if(key != null && key < nums[i]) {
	    		  return true;
	    	  }
	      }
	      
	      return false;
    }
}