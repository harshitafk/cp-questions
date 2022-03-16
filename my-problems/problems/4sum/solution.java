class Solution {
public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		if (nums.length < 4) {
			return new ArrayList<List<Integer>>();
		}

		Set<List<Integer>> set = new HashSet<>();
		for (int i = 0; i < nums.length - 3; i++) {
			int j = i + 1;
			int k = i + 2;
			int l = nums.length - 1;

			while (j < k && k < l) {
				
				while (k < l) {
					int sum = nums[i] + nums[j] + nums[k] + nums[l];

					if (sum == target) {
						set.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
						k++;
						l--;
					} else if (sum > target) {
						l--;
					} else {
						k++;
					}
				}
				k = j + 2;
				l = nums.length - 1;
				++j;

			}
		}

		return new ArrayList<>(set);
	}
}