class Solution {
    public int maxSubArray(int[] nums) {
        return findMaxSubArray(nums, 0, nums.length - 1);
    }
    
    public static int findMaxSubArray(int[] nums, int left, int right) {
		if (left == right) {
			return nums[left];
		}

		int mid = (left + right) / 2;

		int sum = 0;
		int leftMax = Integer.MIN_VALUE;

		for (int i = mid; i >= left; i--) {
			sum += nums[i];

			if (sum > leftMax) {
				leftMax = sum;
			}
		}

		int rightMax = Integer.MIN_VALUE;
		sum = 0;
		for (int i = mid+1; i <= right; i++) {
			sum += nums[i];

			if (sum > rightMax) {
				rightMax = sum;
			}
		}
		
		int maxOfLeftandRight = Math.max(findMaxSubArray(nums, left, mid),
				findMaxSubArray(nums, mid + 1, right));
		
		return Math.max(maxOfLeftandRight, leftMax + rightMax);
	}
}