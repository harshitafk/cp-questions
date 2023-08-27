class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        char[] result = new char[word1.length()+word2.length()];

        int i = 0,d = 0;
        while(i < word1.length() || i < word2.length()){
            
            if(i < word1.length()){
                result[d] = word1.charAt(i);
                d++;  
            }
           
            if(i < word2.length()){
                result[d] = word2.charAt(i);
                d++;
            }
            
            i++;
        }
        
        return new String(result);
    }
}