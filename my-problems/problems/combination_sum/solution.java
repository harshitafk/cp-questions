class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> list = new ArrayList<>();
		backtrack(list, new ArrayList<>(), candidates, target,0);
		return list;
	}
	
	private void backtrack(List<List<Integer>> list,List<Integer> comb,int[] nums,int target, int index) {
		
		if(target < 0) return;
		else if(target == 0) list.add(new ArrayList<>(comb));
		else {
			for(int i = index; i < nums.length; i++) {
				comb.add(nums[i]);
				backtrack(list,comb,nums,target - nums[i],i);
				comb.remove(comb.size()-1);
			}
		}
		
	}
}