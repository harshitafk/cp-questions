class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        
        for(int i = 0; i < nums.length; i++){
            
            int left = i+1, right = nums.length-1;
            
            while(left < right){
                
                int temp = nums[i] + nums[left] + nums[right];
                
                if(Math.abs(target - temp) < Math.abs(target - sum)){
                    sum = temp;
                }
                
                if(temp > target){
                    right --;
                }else if(temp < target){
                    left++;
                }else{
                    return temp;
                }
            }
        }
        
        return sum;
    }
}