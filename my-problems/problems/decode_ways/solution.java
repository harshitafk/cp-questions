class Solution {
    public int numDecodings(String s) {
        
        Integer[] mem=new Integer[s.length()];
        return decode(s, 0,mem);
    }
    
    public int decode(String s, int p,Integer[] mem){
        if(p == s.length()) return 1;
        if(s.charAt(p) == '0') return 0;
        if(mem[p]!=null) return mem[p];
        int res = decode(s,p+1,mem);
        
        if((p < s.length()-1) && (s.charAt(p) == '1' || s.charAt(p) == '2' && s.charAt(p+1) < '7')){
            res += decode(s,p+2,mem);
        }
        
        return mem[p] = res;
    }
}