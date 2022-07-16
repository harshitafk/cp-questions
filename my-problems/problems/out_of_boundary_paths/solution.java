class Solution {
    
    private Long mem[][][] = null;
    private final int mod = (int) Math.pow(10,9) + 7;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        mem = new Long[m+1][n+1][maxMove+1];
        
         return (int) (calcPaths(m,n,maxMove,startRow,startColumn));
    }
    
    public long calcPaths(int m, int n, int maxMove, int startRow, int startColumn){
        
        if(maxMove < 0) return 0;
        
        if(startRow < 0 || startColumn < 0 || startColumn >= n || startRow >= m) return 1;
        
        if(mem[startRow][startColumn][maxMove] != null) return mem[startRow][startColumn][maxMove];
        
        long total = 0;
        long left = calcPaths(m,n, maxMove-1,startRow,startColumn-1);
        long right = calcPaths(m,n, maxMove-1,startRow,startColumn+1);
        long up = calcPaths(m,n, maxMove-1,startRow-1,startColumn);
        long down = calcPaths(m,n, maxMove-1,startRow+1,startColumn);

        total += (left + right + up + down) % mod;
        
        return mem[startRow][startColumn][maxMove] = total;
        
    }
}