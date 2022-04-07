class Solution {
    public int lastStoneWeight(int[] stones) {
      Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
      
      for(int i : stones) queue.add(i);
      
      while(queue.size() > 1){
        queue.add(queue.poll() - queue.poll());
      }
      
      return queue.poll();
    }
}
//25,11,8,7,6,5,1
//14,8,7,6,5,1
//7,6,6,5,1
//6,5,1,1
//1,1,1
//0,1,1

//