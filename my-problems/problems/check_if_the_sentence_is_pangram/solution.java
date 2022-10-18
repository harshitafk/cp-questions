class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int[] alpha = new int[26];
        int count = 0;
        for(char c : sentence.toCharArray()){
            
            if(alpha[c - 'a'] == 0){ 
                alpha[c - 'a']++;
                count++;
            }
            
            if(count == 26){
                return true;
            }
        }
        
        return false;
    }
}