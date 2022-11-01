class Solution {
    public int[] findBall(int[][] grid) {
       int col = grid[0].length;
       int row = grid.length;
        int[] ans = new int[col];
        
        for(int j = 0; j < col; j++){
            
            int cpos = j;
            int npos = -1;
            
            for(int i = 0; i < row; i++){
                npos = cpos + grid[i][cpos];
                
                if(npos < 0 || npos >= col || grid[i][cpos] != grid[i][npos]){
                    cpos = -1;
                    break;
                }
                
                cpos = npos;
            }
            
            ans[j] = cpos;
        }
        
        return ans;
    }
}