class Solution {
    public int lengthOfLIS(int[] nums) {
        TreeSet<Integer> tree = new TreeSet<>();
      
      for(int i = 0; i < nums.length; i++){   //10,9,2,5,3,7,101,18 -> 10,9,2   5,3    7    101,18
        Integer x = tree.ceiling(nums[i]);  //10 --> null  9 --> 10   2-->10   5-->null   3-->5   7-->null   101-->null     18-->101 
        
        if(x != null){              
          tree.remove(x);                  //                 []       []       [2]        [2]      [2,3]      [2,3,7]       [2,3,7]
        }
        tree.add(nums[i]);                //[10]             [9]      [2]      [2,5]       [2,3]    [2,3,7]    [2,3,7,101]   [2,3,7,18]
      }
      
      return tree.size();
    }
}