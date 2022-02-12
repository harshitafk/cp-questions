class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = getPivot(nums) - 1;
      
      if(pivot != -1){
        int pivotSuccessor = getPivotSuccessor(nums,nums[pivot]);
        swap(nums,pivot, pivotSuccessor);
      }
      
      reverseSuffix(nums,pivot+1);
    }
  
  private int getPivot(int[] nums){
    for(int i = nums.length-1; i > 0; --i){
      if(nums[i-1] < nums[i]) return i;
    }
    return 0;
  }
  
  private int getPivotSuccessor(int[] nums,int threshold){
    for(int i = nums.length-1; i >= 0; --i){
      if(threshold < nums[i]) return i;
    }
    return -1;
  }
  
  void reverseSuffix(int[] nums, int start) {
		int end = nums.length - 1;
		while (start < end) {
			swap(nums, start++, end--);
		}
	}

	void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}