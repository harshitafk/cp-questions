class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i = 0; i < heights.length-1; i++) {
			
			int d = heights[i+1] - heights[i];
			
			if(d > 0) {
				q.add(d);
			}
			if(q.size() > ladders) {
				bricks -= q.poll();
			}
			if(bricks < 0) {
				return i;
			}
		}
		return heights.length-1;
    }
}