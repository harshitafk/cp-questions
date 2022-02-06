class Solution {
    public int findJudge(int n, int[][] trust) {
      int[] array = new int[n+1];
      
      for(int i = 0; i< trust.length; i++){
        array[trust[i][0]]--;
        array[trust[i][1]]++;
      }
      
      for(int i = 1; i<array.length;i++){
        if(array[i] == (n-1)) return i;
      }
      
      return -1;
    }
}