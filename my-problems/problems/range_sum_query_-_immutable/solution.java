class NumArray {

    int[] arr = null;
    public NumArray(int[] nums) {
        
        arr = new int[nums.length];
        
        arr[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            arr[i] = nums[i] + arr[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return arr[right];
        }
        
        return arr[right] - arr[left - 1]; 
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */