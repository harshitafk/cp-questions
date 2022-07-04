class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        
        int total = 0,res = 0;
        for(int i = satisfaction.length-1; i >=0; i--){
            
            if(total + satisfaction[i] < 0){
                break;
            }
            
            total += satisfaction[i];
            res += total;
        }
        
        return res;
    }
}