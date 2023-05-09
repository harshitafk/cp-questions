class Solution {
    public int diagonalSum(int[][] mat) {
        int j = mat.length;
        int sum = 0;
        for(int i = 0; i < mat.length ;i++){
            sum += mat[i][i];
            sum += mat[j - 1 - i][i];
        }

        return j % 2 == 0 ? sum : sum - mat[j/2][j/2] ;
    }


}