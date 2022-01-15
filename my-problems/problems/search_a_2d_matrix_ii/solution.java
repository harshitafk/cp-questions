class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      
      if(matrix.length == 1 && matrix[0].length == 1){
        if(matrix[0][0] == target){
          return true;
        }else{
          return false;
        }
      }
      
      int row = 0, column = matrix[0].length - 1;
		while(matrix.length > row && column >= 0 ) {
			if(matrix[row][column] == target) {
				return true;
			}else if(matrix[row][column] < target) {
				row++;
			}else {
				column--;
			}
		}
		return false;
    }
}