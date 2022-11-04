class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;

        char[] sToCharArray = s.toCharArray();
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        while(left < right){
            if(set.contains(sToCharArray[left]) && set.contains(sToCharArray[right])){
                char temp = sToCharArray[left];
                sToCharArray[left] = sToCharArray[right];
                sToCharArray[right] = temp;
                left++;right--;
            }else if(set.contains(sToCharArray[left])){
                right--;
            }else if(set.contains(sToCharArray[right])){
                left++;
            }else{
                left++;right--;
            }
        }

        return new String(sToCharArray);
    }
}