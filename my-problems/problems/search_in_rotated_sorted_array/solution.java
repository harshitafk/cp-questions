class Solution {
    public int search(int[] nums, int target) {
      int left = 0;
		int right = nums.length -1;
		
		if(target < nums[left] && nums[right] < target) return -1;
		
		while(left < right) {
			int mid =left + (right - left) / 2;
			if(nums[mid] <= nums[right]) {
				if(target > nums[mid] && nums[right] >= target) {
					left = mid+1;
				}else {
					right = mid;
				}
			}else {
				if(target <= nums[mid] && target >= nums[left]) {
					right = mid;
				}else {
					left = mid+1;
				}
			}
		}
		
		return nums[left] == target ? left : -1;
    }
}