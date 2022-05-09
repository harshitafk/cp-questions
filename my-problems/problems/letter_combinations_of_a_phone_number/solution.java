class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
      
      if(digits.length() == 0) return list;
      String[] dict = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
      
      backtrack(list,digits.toCharArray(),dict,new StringBuilder());
      
      return list;
    }
  
  public void backtrack(List<String> list, char[] digits, String[] dict, StringBuilder builder){
    if(builder.length() == digits.length){ list.add(builder.toString()); 
                                     return;}
    
    int n = builder.length();
    int dig = digits[n] - '0';
    
    for(char c : dict[dig].toCharArray()){
      backtrack(list,digits,dict,builder.append(Character.toString(c)));
      builder.deleteCharAt(builder.length()-1);
    }
    
  }
}