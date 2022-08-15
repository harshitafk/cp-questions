class Solution {
    public int romanToInt(String s) {
        int result = 0;

        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1); map.put('X',10); map.put('V',5);
        map.put('L',50); map.put('C',100);map.put('D',500);
        map.put('M',1000);
        
       for(int i = s.length()-1; i >= 0; i--){
           if(4 * map.get(s.charAt(i)) < result){
               result -=  map.get(s.charAt(i));
           }else{
               result += map.get(s.charAt(i));                                                    
       }
    }
        
        return result;
                                  
}
}