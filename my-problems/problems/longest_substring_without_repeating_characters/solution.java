class Solution {
    public int lengthOfLongestSubstring(String s) {
     int[] chars = new int[128];
      int j = 0, max =0;
      for(int i = 0; i < s.length(); i++){
        if(chars[s.charAt(i)] > 0){
          j = Math.max(j,chars[s.charAt(i)]);
        }
        
        chars[s.charAt(i)] = i + 1;
        max = Math.max(max, (i - j) + 1);
      }
      
      return max;
    }
}