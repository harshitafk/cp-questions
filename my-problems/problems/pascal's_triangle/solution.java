class Solution {
    public List<List<Integer>> generate(int numRows) {
        int dp[][] = new int[numRows][numRows];
        
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1));
        
        dp[0][0] = 1;
       for(int i = 1; i < numRows; i++){
           List<Integer> list2 = new ArrayList<>();
           for(int j = 0; j < i; j++){
               if(j == 0){
                    list2.add(dp[i][j] = 1);
               }else{
                list2.add(dp[i][j] = dp[i-1][j-1] + dp[i-1][j]);   
               }
           }
           list2.add(dp[i][i] = 1);
           
           list.add(list2);
       }
        
        return list;
    }
}