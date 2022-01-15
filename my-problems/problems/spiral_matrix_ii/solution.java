class Solution {
    public int[][] generateMatrix(int n) {
        		    int[][] matrix = new int[n][n];
	        int totalCell = n * n;
	        int num = 1;
	        int firstRow = 0,lastColumn = n-1,lastRow = n-1, firstColumn = 0;
	        while(totalCell >= num) {
	        	if(totalCell >= num) {
	        		for(int i = firstRow; i <= firstRow; i++) {
		        		for(int j = firstRow; j <= lastColumn; j++) {
		        			matrix[i][j] = num;
		        			num = num + 1;
		        		}	
		        	}
	        	}
	        	
	        	if(totalCell >= num) {
	        	for(int i = firstRow+1; i <= lastRow; i++) {
	        		for(int j = lastColumn; j<=lastColumn; j++) {
	        			matrix[i][j] = num;
	        			num = num + 1;
	        		}
	        	}
	        	}
	        	
	        	if(totalCell >= num) {
	        	for(int i = lastRow; i <= lastRow; i++) {
	        		for(int j = lastColumn-1; j >= firstColumn; j--) {
	        			matrix[i][j] = num;
	        			num = num + 1;
	        		}	
	        	}
	        	}
	        	
	        	if(totalCell >= num) {
	        	for(int i = lastRow-1; i > firstRow; i--) {
	        		for(int j = firstColumn; j<=firstColumn; j++) {
	        			matrix[i][j] = num;
	        			num = num + 1;
	        		}
	        	}
	        	}
	        	
	        	++firstRow;--lastColumn;--lastRow;++firstColumn;
	        	
	        	
	        }
	        return matrix;
    }
}