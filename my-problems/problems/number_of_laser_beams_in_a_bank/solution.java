class Solution {
    public int numberOfBeams(String[] bank) {
        
        int sum = 0;
        String s = bank[0];
        int mult = 0;
        
        for(char c : s.toCharArray()){
            if(c == '1'){
                mult++;
            }
        }
        
        int count = 0;
        for(int i = 1; i < bank.length; i++){
            for(char c : bank[i].toCharArray()){
                if(c == '1'){
                    count++;
                }
            }
            if(count != 0){
            sum += mult * count;
            mult = count;
            count = 0;
            }
        }
        
        return sum;
    }
}