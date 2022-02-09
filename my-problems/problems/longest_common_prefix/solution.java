class Solution {
    public String longestCommonPrefix(String[] strs) {
      Arrays.sort(strs);	
		int size = 0;
		
		if(strs[0].length() > strs[strs.length-1].length()) {
			size = strs[strs.length-1].length();
		}else {
			size = strs[0].length();
		}
		
		StringBuilder strBuild = new StringBuilder();
		for(int i = 0; i < size; i++) {
			if(strs[0].charAt(i) == strs[strs.length-1].charAt(i)) {
				strBuild.append(strs[0].charAt(i));
			}else {
				return strBuild.toString();
			}
		}
		
		return strBuild.toString();
    }
}