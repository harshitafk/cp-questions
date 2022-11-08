class Solution {
    public String makeGood(String s) {

        if(s.length() < 2) return s;

        Stack<Character> stack = new Stack();
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(!stack.isEmpty() && Math.abs(s.charAt(i) - stack.peek()) == 32){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : stack){
            sb.append(c);
        }

        return sb.toString();
    }
}