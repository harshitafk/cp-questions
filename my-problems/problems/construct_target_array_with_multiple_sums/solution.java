class Solution {
    public boolean isPossible(int[] target) {
      if (target.length == 1) return target[0] == 1;
       PriorityQueue<Integer> q = new PriorityQueue<Integer>((a,b) -> b - a);
      
      int sum = 0;
      for(int i : target){
        q.add(i);
        sum += i;
      }
      
      while(q.peek() != 1){
        int curr = q.poll();
        
        if(sum - curr == 1) return true;
        
        int x = curr % (sum - curr);
        sum = sum - curr + x;
        
        if(x == curr || x == 0) return false;
        else q.add(x);
      }
      
      return true;
    }
}