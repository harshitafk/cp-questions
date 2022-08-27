class Solution {
    public boolean reorderedPowerOf2(int n) {
        long count = counter(n);
        
       for(int i = 0; i < 32; i++){
           if(counter(1 << i) == count) return true;
       }
        
        return false;
    }
    
    private long counter(int N){
        
        int res = 0;
        
        for(; N>0; N/=10) res += Math.pow(10,N%10);
        
        return res;
    }
}