class Solution {
    public boolean isPalindrome(int x) {
       int p = x;
	        if(x < 0){
	          return false;
	        }else{
	          int result = 0,mod = 0;
	          while(x > 0){
	            mod = x % 10;
	            x = x / 10;
	            if(x > 0){
	            result = (result + mod) * 10;
	            }else{
	             result = (result + mod);
	            }
	          }
	          
	          if(result == p){
	            return true;
	          }else{
	            return false;
	          }
	        }
    }
}