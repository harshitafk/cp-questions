class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
		
		return getInt(firstWord) + getInt(secondWord) == getInt(targetWord) ? true : false; 
		
	}
	
   public int getInt(String s) {
        int result = 0;
        for(int i=0;i<s.length();i++)
            result = result * 10 + (s.charAt(i) - 'a');
        return result;
    }
}