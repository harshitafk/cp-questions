class Solution {
    public int[] countBits(int n) {
        int[] output = new int[n+1];
        for(int i = 0; i <= n; i++){
            int count = 0;
            int x = i;
            while(x > 0){
                count++;
                x = x & (x-1); 
            }
            output[i] = count;
        }
        
        return output;
    }
}