class Solution {
    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int al = a.length()-1, bl = b.length()-1;
        int carry = 0;
        while(al >= 0 || bl >= 0){
            int sum = carry;

            if(bl >= 0) sum += b.charAt(bl--) - '0';
            if(al >= 0) sum += a.charAt(al--) - '0';

            sb.append(sum % 2);
            carry = sum / 2;
        }

        if(carry != 0) sb.append(1);
        return sb.reverse().toString();
    }
}