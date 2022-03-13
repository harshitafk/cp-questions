class Solution {
    public int evalRPN(String[] tokens) {
         Stack<Integer> stack = new Stack<>();
        
       for(String token : tokens){
           if(!(token.charAt(0) - '*' >= 0 && token.charAt(0) - '*' <= 5) || (token.length() > 1)){
               stack.push(Integer.valueOf(token));
           }else{
               if(token.charAt(0) - '*' == 0){
                   int n = stack.pop();
                   int m = stack.pop();
                   
                   stack.push(n * m);
               }else if(token.charAt(0) - '*' == 1){
                   int n = stack.pop();
                   int m = stack.pop();
                   
                   stack.push(n + m);
               }else if(token.charAt(0) - '*' == 3){
                   int n = stack.pop();
                   int m = stack.pop();
                   
                   stack.push(m - n);
               }else if(token.charAt(0) - '*' == 5){
                   int n = stack.pop();
                   int m = stack.pop();
                   
                   stack.push(m / n);
               }
           }
       }
        
        return stack.pop();
    }
}