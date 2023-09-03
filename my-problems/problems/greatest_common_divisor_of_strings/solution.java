class Solution {
    public String gcdOfStrings(String str1, String str2) {

        int n = str1.length();
        int p =str2.length();

        if(!(str1+str2).equals(str2+str1)) return "";
        else{
            return str1.substring(0,calcGcd(n,p));
        }
    }

    private int calcGcd(int n, int p){
        if(p == 0) return n;

        return calcGcd(p, n%p);
    }
}