class Solution {
    public int maxProduct(int[] nums) {
         int prod = 1;
        int result = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            prod = prod * nums[i];
            result = Math.max(prod, result);
            if(prod == 0) {
                prod = 1;
            }
        }
        prod = 1;
        
        for (int i = nums.length - 1; i >= 0; i--) {
            prod = prod * nums[i];
            result = Math.max(prod, result);
            if(prod == 0) {
                prod = 1;
            }      
        }
        return result;
    }
}