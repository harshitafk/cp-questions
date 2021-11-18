class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer = 0;
	    for(int i = 1; i < nums.length; i++) {
	    	if(nums[pointer] != nums[i]) {
	    		for(int j = pointer+1; j < i; j++) {
	    			nums[j] = nums[i];
	    		}
	    		pointer++;
	    	}
	    }
		
	    return pointer+1;
    }
}