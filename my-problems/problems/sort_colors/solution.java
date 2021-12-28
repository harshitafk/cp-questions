class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int zero=0,one=0,two = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0){
                map.put(nums[i],++zero);
            }else if(nums[i] == 1){
                 map.put(nums[i],++one);
            }else{
                map.put(nums[i],++two);
            }
            
        }
        
         zero=0;one=0;two = 0;
        if(map.containsKey(0)){
             zero = map.get(0);
        }
        
        if(map.containsKey(1)){
             one = map.get(1);
        }
        
         if(map.containsKey(2)){
             two = map.get(2);
        }
       
        for(int i = 0; i < zero; i++){
            nums[i] = 0;
        }
        
        for(int i = zero; i < one+zero; i++){
            nums[i] = 1;
        }
        
        for(int i = one+zero; i <  one+zero+two; i++){
              nums[i] = 2;

        }
    }
}