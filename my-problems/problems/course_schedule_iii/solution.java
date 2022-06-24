class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(a,b)-> a[1] == b[1] ? a[0]-b[0] : a[1]-b[1]);
	        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)-> b-a);
	        int time = 0;
	        for(int[] a : courses) {
	        	if(a[0] <= a[1]) {
	        		if(a[0] + time <= a[1]) {
	        			q.offer(a[0]); time += a[0];
	        		}else {
	        			if(q.peek() > a[0]) {
	        				time -= q.poll();
                   time += a[0];
	        				q.offer(a[0]);
	        			}
	        		}
	        	}
	        }
	        
	        
	        return q.size();
    }
}