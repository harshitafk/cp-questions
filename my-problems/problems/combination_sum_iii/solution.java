class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        
        backtrack(list,new ArrayList<>(),k,1,n);
        
        return list;
    }
    
    public void backtrack(List<List<Integer>> list, List<Integer> temp, int k, int start, int n){
        
        if(temp.size()==k && n == 0){
            List<Integer> tList = new ArrayList<>(temp);
            list.add(tList);
            return;
        } 
        
        for(int i = start; i <= 9; i++){
            temp.add(i);
            backtrack(list,temp,k,i+1,n-i);
            temp.remove(temp.size()-1);
        }
    }
}