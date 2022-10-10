class Solution {
    public String breakPalindrome(String palindrome) {
        
        if(palindrome.length() == 1) return "";
        
        char[] c = palindrome.toCharArray();
        
        
        for(int i = 0; i < palindrome.length()/2; i++){
            for(int j = 0; j < 26; j++){
                if(palindrome.charAt(i)-'a' > j){
                    c[i] = (char) (97 + j);
                    return new String(c);
                }else{
                    break;
                }
            }
        }
        
        c[palindrome.length()-1] = (char) (98);
        
        return new String(c);
    }
}