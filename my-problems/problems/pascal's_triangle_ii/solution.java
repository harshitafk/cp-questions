class Solution {
     public List<Integer> getRow(int rowIndex) {
	        int dp[][] = new int[rowIndex+1][rowIndex+1];
	        
	        dp[0][0] = 1;
	        List<Integer> list2 = new ArrayList<>();
	       for(int i = 1; i <= rowIndex; i++){
	           for(int j = 0; j < i; j++){
	               if(j == 0){
	                   dp[i][j] = 1;
	                   if(i == rowIndex){
	                       list2.add( dp[i][j]); 
	                   } 
	               }else{
	                   dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
	                   if(i == rowIndex){
	                        list2.add(dp[i][j]);   
	                   }
	               }
	           }
	           dp[i][i] = 1;
	       }
	         list2.add(dp[rowIndex][rowIndex] = 1);
	        
	        return list2;
	    }
}