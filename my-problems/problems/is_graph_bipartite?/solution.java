class Solution {
    public boolean isBipartite(int[][] graph) {
         int length = graph.length;
        int[] colors = new int[length];
        Arrays.fill(colors, 0);
      
        for (int i= 0;i<length;i++){
            if (colors[i] == 0){
                Queue<Integer> q = new LinkedList<>();
                q.offer(i);
                colors[i] = 1;
              
                while (!q.isEmpty()){
                    int n = q.poll();
                  
                    for (int j: graph[n]){
                        
                        if (colors[j] == 0){
                           
                            colors[j] = -colors[n];
                            q.offer(j);
                        }
                        else if(colors[j] != -colors[n]) return false;
                    }
                }
            }
        }
        return true;
    }
}