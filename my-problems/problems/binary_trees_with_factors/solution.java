class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        long sum = 0l;
        Map<Integer,Long> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            long count = 1l;

            for(int j = 0; j < i; j++){
                if((arr[i] % arr[j] == 0) && (map.containsKey(arr[i]/arr[j]))){
                    count += (map.get(arr[i]/arr[j])* map.get(arr[j]));
                }
            }
            map.put(arr[i],count);
            sum += (count);
        }

        return (int) (sum % 1000000007);
    }
}