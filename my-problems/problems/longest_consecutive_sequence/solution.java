class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums){
            set.add(num);
        }
        
        int total = 0;
        for(int n : nums){
            if(!set.contains(n-1)){
                int current = 1;
                int currentNum = n;
                
                while(set.contains(currentNum+1)){
                    currentNum += 1;
                    current += 1;
                }
                
               total = Math.max(current,total);   
            }
        }
        
        return total;
    }
}