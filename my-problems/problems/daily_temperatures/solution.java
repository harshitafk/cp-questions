class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Element> stack = new Stack<>();
        
        int[] ans = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            
            if(i == 0){
                stack.push(new Element(temperatures[i],i));
            }else{
                
                if(!stack.isEmpty()){
                    int n = stack.peek().val;
                      while(temperatures[i] > n){
                    
                    Element e = stack.pop();
                    ans[e.pos] = i - e.pos;
                    
                          if(stack.isEmpty()){
                              break;
                          }else{
                              n = stack.peek().val;
                          }
                }
                }
              
                
                stack.push(new Element(temperatures[i],i));
            }
        }
        
        return ans;
    }
    
}

class Element{
        public int val;
        public int pos;
        
        public Element(int val, int pos){
            this.val = val;
            this.pos = pos;
        }
}