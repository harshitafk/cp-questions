class Solution {
    public int[] minOperations(String boxes) {
        List<Integer> list = new ArrayList<>();
      
      for(int i = 0; i < boxes.length(); i++){
        if(boxes.charAt(i) == '1'){
          list.add(i);
        }
      }
      
      int[] ans = new int[boxes.length()];
      
      for(int i = 0; i < ans.length; i++){
        int sum = 0;
        for(int j = 0; j < list.size(); j++){
          if(i != list.get(j)){
           
            sum += Math.abs(i - list.get(j));
           // System.out.println(sum);
          }
        }
        ans[i] = sum;
      }
      
      
      return ans;
    }
}