class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int size = 0;
		
		if(nums1.length > nums2.length) {
			size = nums2.length;
		}else {
			size = nums1.length;
		}
		
		Map<Integer,Integer> elements = new HashMap<>();
		List<Integer> arrayList = new ArrayList<>();
		
		for(int i = 0; i < nums1.length; i++) {
			int value = 0;
			if(elements.get(nums1[i]) != null) {
				value = elements.get(nums1[i]);
				elements.replace(nums1[i], ++value);
			}else {
				elements.put(nums1[i], ++value);
			}
		}
		
		int j = 0;
		for(int i = 0; i < nums2.length; i++) {
			int value = 0;
			if(elements.get(nums2[i]) != null && elements.get(nums2[i]) >= 1) {
				arrayList.add(nums2[i]);
				value = elements.get(nums2[i]);
				elements.replace(nums2[i], --value);
				j++;
			}
		}
		return arrayList.stream().mapToInt(i->i).toArray();
    }
}