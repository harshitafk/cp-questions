class Solution {
    public int countSquares(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                
                if(matrix[i][j] > 0 && i > 0 && j > 0){
                    matrix[i][j] = Math.min(matrix[i-1][j-1],Math.min(matrix[i-1][j],matrix[i][j-1])) + 1;
                }
                    count += matrix[i][j]; 
            }
        }
        
        return count;
    }
}