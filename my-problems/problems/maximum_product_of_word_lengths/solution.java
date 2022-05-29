class Solution {
    public int maxProduct(String[] words) {
        
        int l = words.length;
        int[] state = new int[l];
        
        int c = 0;
        for(String word : words){
            state[c] = getState(word);
            c++;
        }
        
        
        int max = 0;
        for(int i = 0; i < l; i++){
            for(int j = i+1; j < l; j++){
                
                if((state[i] & state[j]) == 0){
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        
        return max;
    }
    
    
    private int getState(String word){
        int ans = 0;
        
        for(char c : word.toCharArray()){
            ans |= 1 << (c - 'a');
        }
        
        return ans;
    }
}