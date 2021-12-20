class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> allrows = new ArrayList<List<Integer>>();

		for(int i = 0; i < numRows; i++) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			row.add(1);
			for(int j = 1; j < i; j++) {
				int val = allrows.get(i-1).get(j-1) + allrows.get(i-1).get(j);
				row.add(val);
			}
            if(i > 0){
               row.add(1); 
            }
			
			allrows.add(row);
		}
		
		return allrows;
    }
}