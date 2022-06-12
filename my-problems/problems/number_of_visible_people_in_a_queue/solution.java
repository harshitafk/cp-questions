class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        
        int[] res = new int[heights.length];
        for(int i =  heights.length-1; i >= 0; i--){
            int count = 0;
            int curr = heights[i];
            
            while(!stack.isEmpty() && curr > stack.peek()){
                stack.pop();
                count++;
            }
            
            if(!stack.isEmpty()){
                count++;
            }
            
            stack.push(heights[i]);
            res[i] = count;
        }
        
        return res;
    }
}