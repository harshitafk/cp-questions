class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.equals("")) {
			return 0;
		}

		int size = needle.length();

		int p = size;
      
      if(haystack.equals(needle)){
        return 0;
      }
      
		for (int i = 0; i < haystack.length(); i++) {
      
      String con = null;
      if(p <= (haystack.length())){
        con = haystack.substring(i, p);
      }			

			if (needle.equals(con)) {
				return i;
			}
			p += 1;
		}

		return -1;
    }
}