class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        
        List<List<Integer>> list = new ArrayList<>();
        
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] < min){
                System.out.println("1");
                if(list.isEmpty()){
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(arr[i-1]);
                    list1.add(arr[i]);
                    list.add(list1);
                    min = arr[i] - arr[i-1] ;
                }else{
                     list.removeAll(list);
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(arr[i-1]);
                    list1.add(arr[i]);
                    list.add(list1);
                    min = arr[i] - arr[i-1] ;
                }
            }else if(arr[i] - arr[i-1] == min){
                List<Integer> list1 = new ArrayList<>();
                    list1.add(arr[i-1]);
                    list1.add(arr[i]);
                    list.add(list1);
            }
        }
        
        return list;
    }
}