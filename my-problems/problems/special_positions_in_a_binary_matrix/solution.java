class Solution {
    public int numSpecial(int[][] mat) {
      int[] row = new int[mat.length];
      int[] col = new int[mat[0].length];
      int res = 0;
      for(int i = 0; i < mat.length; i++){
        for(int j = 0; j < mat[i].length; j++){
          if(mat[i][j] == 1){
            row[i]++;
            col[j]++;
          }
        }
      }
      
       for(int i = 0; i < mat.length; i++){
        for(int j = 0; j < mat[i].length; j++){
          
           if(mat[i][j] == 1 && row[i] == 1 && col[j] == 1){
             res++;
        }
       }   
    }
      
       return res;
}
}