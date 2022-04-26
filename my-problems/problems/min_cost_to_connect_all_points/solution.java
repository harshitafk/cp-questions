class Solution {
    public int minCostConnectPoints(int[][] points) {
        if(points.length == 0 && points == null){
          return 0;
        }
      
      int n = points.length;
      boolean[] visited = new boolean[n];
      
      int requiredEdges = n-1;
      int minCost = 0;
      
      PriorityQueue<Edge> minHeap = new PriorityQueue<>((a,b) -> a.cost - b.cost);
      int[] coordinate1 = points[0];
      
      for(int i = 1; i < points.length; i++){
        int[] coordinate2 = points[i];
        int cost = Math.abs(coordinate2[0] - coordinate1[0]) +
                   Math.abs(coordinate2[1] - coordinate1[1]);
        
        Edge e = new Edge(0,i,cost);
        minHeap.add(e);
      }
      
      visited[0] = true;
      
      while(!minHeap.isEmpty() && requiredEdges > 0){
        Edge e = minHeap.poll();
        int point1 = e.point1;
        int point2 = e.point2;
        int cost = e.cost;
        
        if(!visited[point2]){
          minCost += cost;
          visited[point2] = true;
          
          for(int i = 0; i < n; i++){
            if(!visited[i]){
              int distance = Math.abs(points[point2][0]-points[i][0])
                                        + Math.abs(points[point2][1]-points[i][1]);
              
               minHeap.add(new Edge(point2, i, distance));              
            }
          }
          
          requiredEdges--;
        }
        
      }
      
      return minCost;
    }
  
  class Edge{
    int point1;
    int point2;
    int cost;
    
    public Edge(int point1, int point2, int cost){
      this.point1 = point1;
      this.point2 = point2;
      this.cost = cost;
    }
  }
}