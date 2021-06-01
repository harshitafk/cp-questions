class Solution {
    public String interpret(String command) {
        StringBuilder str = new StringBuilder();
        	   int i = 0;
        	   while(i< command.length()) {  
        	   if(command.charAt(i) == 'G') {
        		   str.append('G');
        		   i=i+1;
        	   }else if(command.charAt(i) == '(' && command.charAt(i+1) == ')') {
        		   str.append('o');  
        		   i=i+2;
        	   }else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a' 
                        && command.charAt(i+2) == 'l' && command.charAt(i+3) == ')') {
        		   str.append("al");
        		   i=i+4;   
        	   }else {
        		   break;
        	   }     
    }
        	   String myStr = str.toString();
        	   return myStr;
        
    }
}