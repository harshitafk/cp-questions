class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sBuilder = new StringBuilder();
        StringBuilder tBuilder = new StringBuilder();
        int i = 0;
        
        for(int j = s.length()-1; j >= 0; j--){
          char c = s.charAt(j);
          if(c == '#'){
            i++;
          }else if(i == 0){
            sBuilder.append(c);
          }else{
            i--;
          }
        }
      
      i = 0;
      for(int j = t.length()-1; j >= 0; j--){
          char c = t.charAt(j);
          if(c == '#'){
            i++;
          }else if(i == 0){
            tBuilder.append(c);
          }else{
            i--;
          }
        }
      
      return sBuilder.toString().equals(tBuilder.toString()) ? true : false;
    }
}