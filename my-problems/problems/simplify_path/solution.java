class Solution {
    public String simplifyPath(String path) {
      Deque<String> stack = new LinkedList<>();
      
      for(String s : path.split("/")){
        if(s.equals("..")) stack.poll();
        else if(!s.equals("") && !s.equals(".")) stack.push(s);
      }
      
      StringBuilder string = new StringBuilder();
      if(stack.size() == 0) return "/";
      
      while(stack.size() > 0){
        string.append("/").append(stack.pollLast());
      }
      
      return string.toString();
    }
}