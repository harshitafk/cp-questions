class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set<String> set = new HashSet<>();
        
        for(String word : words){
            
            StringBuilder str = new StringBuilder();
            
            for(int i = 0; i < word.length(); i++){
                str.append(code[word.charAt(i)-'a']);
            }
            
            set.add(str.toString());
        }
        
        return set.size();
    }
    
}