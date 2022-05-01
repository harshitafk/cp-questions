class Solution {
    public boolean backspaceCompare(String s, String t) {
      
      return getString(s).equals(getString(t));
    }
  
  private String getString(String str){
    
     StringBuilder s = new StringBuilder();
    int j = 0;
      for(int i = str.length() - 1; i >= 0; i--){
        char c = str.charAt(i);
        if(c == '#'){
          j++;
        }else if(j == 0){
          s.append(c);
        }else{
          j--;
        }
      }
    
    return s.toString();
  }
}