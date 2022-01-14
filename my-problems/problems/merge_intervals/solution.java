class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (n1,n2) -> Integer.compare(n1[0], n2[0]));
		
		List<int[]> result = new ArrayList<>();
		
		int start = intervals[0][0];
		int end = intervals[0][1];
		
		int i = 1;
		
		while(i < intervals.length) {
			int s = intervals[i][0];
			int e = intervals[i][1];
			
			if(s <= end) {
				end = Math.max(end, e);
			}else{
				result.add(new int[] {start,end});
				start = s;
				end = e;
			}
			i++;
		}
		
		result.add(new int[] {start,end});
		return result.toArray(new int[result.size()][2]);
    }
}