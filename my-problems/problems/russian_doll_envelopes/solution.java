class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, new Comparator<>() {

			@Override
			public int compare(int[] o1, int[] o2) {

				if (o1[0] == o2[0]) {
					return o2[1] - o1[1];
				} else {
					return o1[0] - o2[0];
				}
			}
		});
		
		
		int ans = 0;
		int[] dp = new int[envelopes.length];
		
		for(int[] envelope : envelopes) {
			int left = 0, right = ans;
			
			while(left < right) {
				int mid = left + (right - left)/2;
				
				if(dp[mid] < envelope[1]) {
					left = mid+1;
				}else {
					right = mid;
				}
			}		
			dp[left] = envelope[1];
			
			if(left == ans) {
				ans++;
			}
		}
		
		return ans;
		
    }
}