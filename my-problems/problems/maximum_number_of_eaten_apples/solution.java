class Solution {
    public int eatenApples(int[] apples, int[] days) {
        int res = 0;
        int len = apples.length;

        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)-> a[0]-b[0]);

        for(int i = 0; i < len || !queue.isEmpty(); i++){
            if( i < len) queue.offer(new int[]{i + days[i],apples[i]});

            while(!queue.isEmpty() && queue.peek()[0] <= i){
                queue.poll();
            }
            
            if(!queue.isEmpty()){
                res++;
                
                if(--queue.peek()[1] == 0)
                    queue.poll();
            }
        }

        return res;
    }
}