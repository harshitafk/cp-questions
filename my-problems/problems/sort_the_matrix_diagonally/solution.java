class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int r = mat.length, c = mat[0].length;
        
        Map<Integer,PriorityQueue<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                map.putIfAbsent(i-j,new PriorityQueue<Integer>());
                map.get(i - j).add(mat[i][j]);
            }
        }
        
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                mat[i][j] = map.get(i - j).poll();
            }
        }
        
        return mat;
    }
}