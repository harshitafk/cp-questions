class Solution {
    public String countAndSay(int n) {
        
        if(n == 1) return "1";
        
        if(n == 2) return "11";
        
        String s = "1";
        
        for(int i = 1; i < n; i++){
            
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char c = s.charAt(0);
            for(int j = 1; j < s.length(); j++){
                if(s.charAt(j) != c){
                    sb.append(count);
                    sb.append(c);
                    c = s.charAt(j);
                    count = 1;
                }else{
                    count++;
                }
            }
            
            sb.append(count);
            sb.append(c);
            
            s = sb.toString();
        }
        
        
        return s;
    }
}