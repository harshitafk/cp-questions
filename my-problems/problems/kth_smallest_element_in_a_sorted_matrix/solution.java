class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int row = matrix.length;
        int column = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[row-1][column-1];
        
        while(low < high){
            int mid = low + (high - low)/2;
            int count = 0;
            int j = column - 1;
            
            for(int i = 0; i < row; i++){
                while(j >= 0 && matrix[i][j] > mid){
                    j--;
                }
                count += j+1;
            }
            
            if(count < k){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}