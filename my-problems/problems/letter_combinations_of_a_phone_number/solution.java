class Solution {
    public List<String> letterCombinations(String digits){
      	List<String> list = new ArrayList<>();
		
        if (digits.length() == 0) return list;
        
        String[] dict = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        backtrack(list,dict,digits.toCharArray(),new StringBuilder());  
        
        return list;
    }
	
	private void backtrack(List<String> list, String[] dict, char[] digitsChar, StringBuilder s) {
		if(s.length() == digitsChar.length) { list.add(s.toString()); return;}
		
		int length = s.length();
		int index = digitsChar[length] - '0';
		for(char letter : dict[index].toCharArray()) {
			backtrack(list,dict,digitsChar,s.append(Character.toString(letter)));
			s.deleteCharAt(s.length() - 1);
		}	
	}
  
}