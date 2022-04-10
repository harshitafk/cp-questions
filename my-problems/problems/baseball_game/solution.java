class Solution {
    public int calPoints(String[] ops) {
      Stack<Integer> stack = new Stack<>();
        for(String s : ops){
          if(s.equals("C")){
            stack.pop();
          }else if(s.equals("D")){
             stack.push(stack.peek()*2);
          }else if(s.equals("+")){
           int val = stack.pop();
           int val2 = val + stack.peek();
           stack.push(val);
           stack.push(val2);
          }else{
            stack.push(Integer.valueOf(s));
          }
        }
      
      int sum = 0;
      while(!stack.isEmpty()){
        sum += stack.pop();
      }
      
      return sum;
    }
}