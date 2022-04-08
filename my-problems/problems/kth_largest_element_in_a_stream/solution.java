class KthLargest {

    private PriorityQueue<Integer> queue;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
       
      this.queue = new PriorityQueue<>();
       for(int i : nums){
         add(i);
       }
    }
    
    public int add(int val) {
       
        this.queue.add(val);
      if(queue.size() > k){
        queue.remove();
      }
      
      return queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */