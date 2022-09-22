class Solution {
    public String reverseWords(String s) {

        String[] arr = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++) {
            String ss = arr[i];
            sb.append(reverse(ss.toCharArray()));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    private String reverse(char[] c){
        int l = 0, r = c.length-1;
        while(l < r){
            char temp = c[l];
            c[l] = c[r];
            c[r] = temp;
            l++;
            r--;
        }
        return new String(c);
    }
}