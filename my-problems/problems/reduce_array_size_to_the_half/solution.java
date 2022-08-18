class Solution {
    public int minSetSize(int[] arr) {
        
         Map<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> (b-a));

        for(int i : map.values()){
            queue.offer(i);
        }
        int sum = 0, count = 0;

        while(sum < arr.length/2){
            sum += queue.poll();
            count++;
        }

        return count;
    }
}