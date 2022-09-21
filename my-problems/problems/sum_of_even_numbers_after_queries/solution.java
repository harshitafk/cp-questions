class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                sum += nums[i];
            }
        }
        
        int[] sumA = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++){
            if(Math.abs(queries[i][0]) % 2 == 0){
                if(Math.abs(nums[queries[i][1]]) % 2 == 0){
                   sum = sum + queries[i][0];
                }
            }else{
                
                if(Math.abs(nums[queries[i][1]]) % 2 == 0){
                    sum = sum - nums[queries[i][1]];
                  }else{
                    sum = sum + nums[queries[i][1]] + queries[i][0];
                }
            }
            nums[queries[i][1]] = nums[queries[i][1]] + queries[i][0];
            sumA[i] = sum;
            }
                                            return sumA;
    }
                        
}