class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] r = new int[2];
        
        r[0] = findFirst(nums,target);
        r[1] = findLast(nums,target);
        
        return r;
    }
    
    private int findFirst(int[] nums, int target){
        int l = 0, r = nums.length-1, result = -1;
        
        while(l <= r){
            
            int mid = l + (r - l)/2;
            
            if(nums[mid] == target){
             result = mid;
             r = mid-1;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
            
        }
        
        return result;
    }
    
    private int findLast(int[] nums, int target){
        int l = 0, r = nums.length-1, result = -1;
        
        while(l <= r){
            int mid = l + (r - l)/2;
            
            if(nums[mid] == target){
             result = mid;
             l = mid+1;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        
        return result;
        
    }
}