class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        int rs = grid.length;
        int cs = grid[0].length;
        
        if(grid[0][0] == 1) return -1;
        
        Queue<int[]> q = new LinkedList<>();
        
        int[][] dirs = {{0,1},{1,0},{1,1},{-1,0},{0,-1},{-1,-1},{1,-1},{-1,1}};
        q.add(new int[]{0,0,1});
        grid[0][0] = 1;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            while(size-- > 0){
                int[] p = q.poll();
                
                if(p[0] == rs-1 && p[1] == cs-1) return p[2]; 
                
                for(int[] dir : dirs){
                    int r = p[0] + dir[0];
                    int c = p[1] + dir[1];
                    
                    if(r >= 0 && c >= 0 && r < rs && c < cs && grid[r][c] == 0){
                        q.add(new int[]{r,c,p[2] + 1});
                        grid[r][c] = 1;
                    }
                }
            }
        }
        
        return -1;
    }
}