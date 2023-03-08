class Solution {
    public int minJumps(int[] arr) {
       int step = 0;
       int n = arr.length;
       if(n == 1) return step;
       Map<Integer, List<Integer>> map = new HashMap<>();

       for(int i = 0; i < n; i++){
           map.computeIfAbsent(arr[i],v -> new ArrayList<>()).add(i);
       }

       Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
       while(!queue.isEmpty()){
           step++;
           int k = queue.size();
           for(int i = 0; i < k; i++){
               int j = queue.poll();

               if(j-1 >= 0 && map.containsKey(arr[j-1])){
                   queue.offer(j-1);
               }

               if(j + 1 < n && map.containsKey(arr[j+1])){
                   if(j + 1 == n-1) return step;
                   queue.offer(j+1);
               }

               if(map.containsKey(arr[j])){
                   for(int m : map.get(arr[j])){
                       if(m != j){
                           if(m == n-1) return step;
                       } 
                       queue.offer(m);
                   }
               }
               map.remove(arr[j]);
           }
       }
       return step;
    }
}