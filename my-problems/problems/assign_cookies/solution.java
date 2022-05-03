class Solution {
    public int findContentChildren(int[] g, int[] s) {
      Arrays.sort(g);
      Arrays.sort(s);
      
      int gLen = 0, sLen = 0;
      int count = 0;
      while(gLen < g.length && sLen < s.length){
        if(g[gLen] <= s[sLen]){
          count++;
          gLen++;sLen++;
        }else{
          sLen++;
        }
      }
      
      return count;
      
    }
}