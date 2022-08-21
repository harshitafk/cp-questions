class Solution {
    public int[] movesToStamp(String stamp, String target) {
        char[] s = stamp.toCharArray();
        char[] t = target.toCharArray();
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[target.length()];

        int stars = 0;
        while(stars < t.length){
            boolean doneReplace = false;

            for(int i = 0; i<= t.length - s.length; i++){
                if(!visited[i] && canReplace(s,t,i)){
                    stars = doReplace(t,i,s.length,stars);
                    doneReplace = true;
                    visited[i] = true;
                    list.add(i);
                    if(stars == t.length) break;
                }
            }

            if(doneReplace != true){
                return new int[0];
            }
        }

        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(list.size()-i-1);
        }

        return res;
    }

    private boolean canReplace(char[] s,char[] t, int p){

        for(int i = 0; i < s.length; i++){
            if(t[i+p] != '*' && t[i+p] != s[i]){
                return false;
            }
        }

        return true;
    }

    private int doReplace(char[] t,int p, int len, int count){
        for(int i = 0; i < len; i++){
            if(t[i+p] != '*'){
                t[i+p] = '*';
                count++;
            }
        }

        return count;
    }
}