class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
		int index = 0;

		backtrack(ans, index, nums, new ArrayList<>());
		return ans;

	}

	private void backtrack(List<List<Integer>> ans, int index, int[] nums, List<Integer> list) {

		ans.add(new ArrayList<>(list));

		for (int i = index; i < nums.length; i++) {
			list.add(nums[i]);
			backtrack(ans, i+1, nums, list);
			list.remove(list.size() - 1);
		}
	}
}