class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] cloneNums = new int[nums.length];
		int j = 0,k=n;
		for(int i = 0; i < n; i++) {
			cloneNums[j] = nums[i];
			cloneNums[j+1] = nums[k];
			k++;
			j+=2;
		}
		
		return cloneNums;
    }
}