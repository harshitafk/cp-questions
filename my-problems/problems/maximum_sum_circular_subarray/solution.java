class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int nonCircularSum = kadaneMaxSum(nums); //Find max subarray
        int totalSum = 0;
        
        for(int i=0;i<nums.length;i++){    //loop to calculate the total sum
            totalSum += nums[i];
            nums[i] = -nums[i]; // change previous elements's sign(to pass it to same maxSubarray method)
        }
              
        int circularSum = totalSum + kadaneMaxSum(nums);  // circular max = totalSum - minSubArray  (we have changed the sign                                                        // so we add it to total sum because -(-1) = 1
      
        if(circularSum == 0) return nonCircularSum;     // 0 return other max sum; In case of - (-3,-2,-3)
        
        return Math.max(circularSum,nonCircularSum);   // if not 0 return max of both
    }
    
    int kadaneMaxSum(int[] nums){
      int max = Integer.MIN_VALUE;
      int sum = 0;
      
      for(int i = 0; i < nums.length; i++){
        sum += nums[i];
        max = Math.max(sum,max);
        if(sum < 0){
          sum = 0;
        }
      }
      return max;
    }
}