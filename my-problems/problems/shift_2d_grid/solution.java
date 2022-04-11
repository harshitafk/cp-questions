class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length, column = grid[0].length;
      
      int[][] temp = new int[row][column];
      for(int i = 0; i < grid.length; i++){
        for(int j = 0; j < grid[0].length; j++){
          int index = ((i * column + j) + k) % (row * column);
          int rTemp = index / column;
          int cTemp = index % column;
          temp[rTemp][cTemp] = grid[i][j];
        }
      }
      
     return (List)Arrays.asList(temp);
    }
}