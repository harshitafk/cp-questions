class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listOfList = new ArrayList<>();
        listOfList.add(Arrays.asList(1));
        
        for(int i = 1; i < numRows; i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            
             
            for(int j = 0; j < i-1; j++){    
                List<Integer> getList = listOfList.get(i-1);
                int sum = getList.get(j) + getList.get(j+1);
                if(list.add(sum));  
            }
            
            list.add(1);
            listOfList.add(list);
        }
        
        return listOfList;
    }
}