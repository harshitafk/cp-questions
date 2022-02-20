class Solution {
    public boolean checkRecord(String s) {
      int a = 0,l = 0;
      
        for(int i = 0; i < s.length(); i++){
        
          if(s.charAt(i) == 'L'){
            l++;
          }else if(s.charAt(i) == 'A'){
            a++;
            l = 0;
          }else if(s.charAt(i) == 'P'){
            l = 0;
          }
          
          if(l >= 3 || a >= 2){
            return false;
          } 
        }
      return true;
    }
}