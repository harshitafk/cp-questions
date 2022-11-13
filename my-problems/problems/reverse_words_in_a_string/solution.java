class Solution {
    public String reverseWords(String s) {
        LinkedList<String> queue = new LinkedList<>();
        StringBuilder addChar = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                queue.addFirst(addChar.toString());
                addChar.setLength(0);
                continue;
            }

            addChar.append(s.charAt(i));

            if(i == s.length()-1){
                queue.addFirst(addChar.toString());
            }
        }

        StringBuilder sb = new StringBuilder();

        for(String str : queue){
            if(!str.equals(" ") && !str.equals("")){
            sb.append(str).append(" ");
            }
        }

        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}