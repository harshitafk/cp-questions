class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      List<Integer>[] bucket = new List[nums.length + 1];
      Map<Integer,Integer> map = new HashMap<>();
      
      for(int i : nums){
        map.put(i,map.getOrDefault(i,0)+1);
      }
      
      for(int i : map.keySet()) {
			 int freq = map.get(i);
        
        if(bucket[freq] == null){
          bucket[freq] = new ArrayList<>();
        }
         bucket[freq].add(i); 
		 }
      
      List<Integer> result = new ArrayList<>();
      
      for(int i = bucket.length-1; i >=0 && result.size() < k; i--){
        if(bucket[i] != null){
          result.addAll(bucket[i]);
        }
      }
      
      return result.subList(0, k).stream().mapToInt(i->i).toArray();
    }
}