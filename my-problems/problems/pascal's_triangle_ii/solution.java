class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[][] row = new int[rowIndex+1][rowIndex+1];
        List<Integer> list = new ArrayList<>();
        if(rowIndex == 0) {
        	 list.add(1);
        	 return list;
        }
        for(int i = 1; i <= rowIndex; i++) {
        	   row[i][0] = 1; 
        	for(int j = 1; j < i; j++) {
        		  row[i][j] = row[i-1][j-1] + row[i-1][j];     		
        	}
        	row[i][i] = 1;
        }
        
       for(int i =0; i < row[rowIndex].length; i++) {
    	   list.add(row[rowIndex][i]);
       }
       
       return list;
    }
}