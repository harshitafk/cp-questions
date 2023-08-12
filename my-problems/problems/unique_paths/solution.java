class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m+1][n+1];

        for(int i = 1; i < m+1; i++){
            for(int j = 1; j < n+1; j++){
                if(i == 1 && j == 1){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i][j-1] + arr[i-1][j];
                }
            }
        }

        return arr[m][n];
    }
}