class Solution {
   static HashMap<String,Boolean> map = new HashMap<>();
    public boolean isScramble(String a, String b) {
        
if(a.equals(b)) return true;

if(a.length() <= 1 || a.length() != b.length())return false;

int n = a.length();
boolean flag = false;
String key = a + ' ' + b;
 if ( map.containsKey(key) ) return map.get(key);
for(int i = 1; i <= n-1; i++){
boolean cond1 = ((isScramble(a.substring(0,i) , b.substring(n-i,n)) == true) && (isScramble(a.substring(i,n) , b.substring(0,n-i)) == true));
boolean cond2 = (isScramble(a.substring(0,i) , b.substring(0,i)) == true) && (isScramble(a.substring(i,n) , b.substring(i,n)) == true);
if(cond1 || cond2){
flag = true;
break;
}
}
       map.put(key, flag);
return flag;
    }
}