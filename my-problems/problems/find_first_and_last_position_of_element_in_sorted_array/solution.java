class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] result = new int[2];
		result[0] = findFirst(nums, target, 0, nums.length - 1, -1);

		result[1] = findLast(nums, target, 0, nums.length - 1, -1);

		return result;
	}

	private int findLast(int[] nums, int target, int start, int end, int result) {
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] <= target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

			if (nums[mid] == target) {
				result = mid;
			}
		}
		return result;
	}

	private int findFirst(int[] nums, int target, int start, int end, int result) {
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] >= target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			
			if (nums[mid] == target) {
				result = mid;
			}
		}

		return result;
    }
}