class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
      int rowSize = mat.length;
	      int colSize = mat[0].length;
	      
	      if((rowSize * colSize) != (r*c)) {
	    	  return mat;
	      }else {
	    	  int[][] inArr = new int[r][c];
	    	  int k = 0,m= 0,n = 0;
	    	  for(int i = 0,j=0; i < rowSize*colSize; i++) {
	    		  if(k > c-1) {
					  k = 0;
					  j++;
				  }
	    		  
	    		  if(n > colSize-1) {
					  n = 0;
					  m++;
				  }
	    		  inArr[j][k] = mat[m][n];
	    		  k++;
	    		  n++;
	    				 
	    	  }
	    	  
	    	  return inArr;
	      }
    }
}