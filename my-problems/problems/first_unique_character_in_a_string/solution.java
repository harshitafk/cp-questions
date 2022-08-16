class Solution {
    public int firstUniqChar(String s) {
        int[] ch = new int[26];
        
        Arrays.fill(ch,-1);
        
        for(int i = 0; i < s.length(); i++){
            if(ch[s.charAt(i) - 'a'] == -1) ch[s.charAt(i) - 'a'] = i;
            else
                ch[s.charAt(i) - 'a'] = -2;
        }
        
        int res = Integer.MAX_VALUE;
        
        for(int i = 0; i < 26; i++){
            if(ch[i] >= 0){
            res = Math.min(res,ch[i]);    
            }
        }
        
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}