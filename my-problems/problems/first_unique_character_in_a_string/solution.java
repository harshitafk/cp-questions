class Solution {
    public int firstUniqChar(String s) {
        	Map<Character,Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			if(map.get(s.charAt(i))== null) {
				map.put(s.charAt(i), i);
			}else {
				map.put(s.charAt(i), i+10000000);
			}
		}
		
		
		List<Integer> list = new ArrayList<>(map.values());
		list.sort((a,b) -> a.compareTo(b));
		
		if(list.get(0) > 10000000) {
			return -1;
		}else {
			return list.get(0);
		}
    }
}