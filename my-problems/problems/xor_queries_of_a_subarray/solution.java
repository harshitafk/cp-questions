class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefix = new int[arr.length];
		int[] answer = new int[queries.length];
		int j;
		for(int i = 0; i < arr.length; i++) {
			if(i - 1 < 1) {
				j = 0;
			}else {
				j = i - 1;
			}
			prefix[i] = prefix[j] ^ arr[i];
		}
		for(int i = 0; i < queries.length; i++) {
				int l = queries[i][0];
				int r = queries[i][1];
				if(l > 0) {
					answer[i] = prefix[r] ^ prefix[l - 1];
			}else {
				answer[i] = prefix[r];
			}
		}
		
		return answer;
    }
}