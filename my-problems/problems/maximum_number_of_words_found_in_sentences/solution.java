class Solution {
    public int mostWordsFound(String[] sentences) {
      
      int max = Integer.MIN_VALUE;
      
      for(String s : sentences){
        max = Math.max(max, s.split(" ").length);
      }
      
      return max;
    }
}