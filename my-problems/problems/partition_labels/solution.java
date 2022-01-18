class Solution {
    public List<Integer> partitionLabels(String s) {
      
      int[] charLastIndex = new int[26];
		
		for(int i = 0; i < s.length(); i++) {
			charLastIndex[s.charAt(i) - 'a'] = i;
		}
		
		List<Integer> list = new ArrayList<>();
		int start = 0,last = 0;
		
		for(int i =0; i <s.length(); i++) {
			last = Math.max(last,charLastIndex[s.charAt(i) - 'a']);
			
			if(last == i) {
				list.add(last - start + 1);
				start = last + 1;
			}
		}
		
		return list;
        
    }
}