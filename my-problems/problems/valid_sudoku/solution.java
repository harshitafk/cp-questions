class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
		for(int i = 0; i< 9; i++) {
			for(int j = 0; j < 9; j++) {
				char val = board[i][j];
				if(val != '.') {
					if(!set.add("Row"+i+""+val) ||
						!set.add("Column"+j+""+val) ||
						!set.add("Block"+i/3+""+j/3+""+val))
						return false;
					
				}
			}
		}
		return true;
    }
}