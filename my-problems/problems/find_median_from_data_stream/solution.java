class MedianFinder {

   private PriorityQueue<Integer> small;
    private PriorityQueue<Integer> large;
    private boolean flag;
    
    public MedianFinder() {
        small = new PriorityQueue<>();
        large = new PriorityQueue<>(Collections.reverseOrder());
        flag = true;
    }

    public void addNum(int num) {
        if(flag){
            small.add(num);
            large.add(small.poll());
        }else{
            large.add(num);
            small.add(large.poll());
        }
        flag = !flag;
    }

    public double findMedian() {
        if(flag){
            return (small.peek() + large.peek()) / 2.0;
        }else{
            return large.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */