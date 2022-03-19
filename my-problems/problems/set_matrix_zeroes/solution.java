import java.util.Iterator;

class Solution {
    public void setZeroes(int[][] matrix) {
      
      boolean flag = false;
      Set<Integer> set = new HashSet<>();
      
        for(int i = 0; i < matrix.length; i++){
          for(int j = 0; j < matrix[i].length; j ++){
            if(matrix[i][j] == 0){
             for(int k = 0; k < matrix[i].length; k++){
               if(matrix[i][k] == 0) set.add(k);
                 
                 
               matrix[i][k] = 0;
             }
              
              set.add(j);
              break;
            }
          }
        }
      
       Iterator<Integer> iterate = set.iterator();
		 
		 while(iterate.hasNext()) {
       int a = iterate.next();
       for(int i = 0; i < matrix.length; i++){
         matrix[i][a] = 0;
       }
    }
    }
}