class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0, j = nums.length - 1; i < j;){
            if(nums[i] + nums[j] == k){
                System.out.println(i + " " + j);
                i++;
                j--;
                count++;
            }else if(nums[i] + nums[j] > k){
                j--;
            }else{
                i++;
            }
        }
        
        return count;
    }
}