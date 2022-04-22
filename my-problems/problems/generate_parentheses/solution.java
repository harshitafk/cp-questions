class Solution {
    public List<String> generateParenthesis(int n) {
      
      List<String> list = new ArrayList<>();
        helper(list,new StringBuilder(),0,0,n);
      
      return list;
    }
  
  private void helper(List<String> list, StringBuilder builder, int open, int close, int n){
    
    if(builder.length() == 2*n){
      list.add(builder.toString());
      return;
    }
    
    if(open < n){
      helper(list,builder.append("("),open+1,close,n);
      builder.deleteCharAt(builder.length() - 1);
    }
    
    if(close < open){
      helper(list,builder.append(")"),open,close+1,n);
      builder.deleteCharAt(builder.length() - 1);
    }
  }
}