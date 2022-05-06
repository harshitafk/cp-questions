class Solution {
    public String removeDuplicates(String s, int k) {
         int i = 0;
        int[] count = new int[s.length()];
        char[] res = s.toCharArray();
        
        for(int j = 0; j < s.length(); j++,i++){
            res[i] = res[j];
            if(i>0 && res[i-1] == res[j]){
               count[i] = count[i-1] + 1; 
            }else{
                count[i] = 1; 
            }
            
            if(count[i] == k){
                i -= k;
            }   
        }
        
        return new String(res,0,i);
    }
}