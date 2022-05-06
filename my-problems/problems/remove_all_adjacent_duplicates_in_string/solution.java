class Solution {
    public String removeDuplicates(String s) {
       StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(sb.isEmpty()){
                sb.append(s.charAt(i));
                count++;
            }else if(sb.charAt(count-1) == s.charAt(i)) {
            	sb.deleteCharAt(count-1);
            	count--;
            }else {
            	sb.append(s.charAt(i));
            	count++;
            }
        }
        
        
        return sb.toString();
        }
}