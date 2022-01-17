class Solution {
    public String addStrings(String num1, String num2) {
        int BASE = 10;
	
	        StringBuilder sb = new StringBuilder();
	        
	        int i = num1.length()-1;
	        int j = num2.length()-1;
	        
	        int sum = 0;
	        int carry = 0;
	        while (i >= 0 || j >= 0){
	            sum = carry;
	            
	            if (i >= 0) sum += num1.charAt(i--)-'0';
	            if (j >= 0) sum += num2.charAt(j--)-'0';
	            
	            carry = sum / BASE;
	            sb.append(sum % BASE);
	        }
	        
	        if (carry != 0) sb.append(carry);
	        
	        return sb.reverse().toString(); 
    }
}