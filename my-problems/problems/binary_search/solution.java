class Solution {
    public int search(int[] nums, int target) {
        int right = 0,left = nums.length-1;
        
        while(true){
            if(left < right){
                return -1;
            }
            
            int mid = right + ((left - right)/2);
            
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                right = mid+1;
            }else{
                left = mid - 1;
            }
        }
    }
}