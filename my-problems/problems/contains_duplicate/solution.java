class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0; i< nums.length; i++) {
			int n = nums[i];
			
			if(map.get(n) == null) {
				int value =+ 1;
				map.put(n, value);
			}else {
				return true;
			}
		}
		return false;
    }
}