class Solution {
    public int romanToInt(String s) {
      int ans = 0;
     for(int i = s.length()-1; i>= 0; i--){
        char c = s.charAt(i);
        int val = getCharValue(c);
        if(4 * val < ans) ans -= val;
        else ans += val;
      }
      return ans;
    }
  
  private int getCharValue(char c){
    switch(c){
      case 'I': return 1;
      case 'V': return 5; 
      case 'X': return 10;
      case 'L': return 50;
      case 'C': return 100;
      case 'D': return 500;
      case 'M': return 1000;
      default : return 0;
    }
  }
}