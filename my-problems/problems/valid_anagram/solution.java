class Solution {
    public boolean isAnagram(String s, String t) {
      if (s.length()!=t.length()) return false;
        
        int[] array = new int[26];
		
		for(int i = 0; i <s.length(); i++)array[s.charAt(i) - 'a']++;
		for(int j = 0; j <t.length(); j++)if(--array[t.charAt(j) - 'a'] < 0) return false;
		
		return true;
    }
}