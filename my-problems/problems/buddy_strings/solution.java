class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length())
			return false;

		if (s.equals(goal)) {
			Set<Character> set = new HashSet<>();

			for (int i = 0; i < s.length(); i++) {
				if (!set.add(s.charAt(i))) return true;
			}
            return false;
		}
		
		int counter = 0,sChars = 0,goalChars = 0,pos1 = 0,pos2 = 0;
		
		for(int i = 0; i< s.length(); i++) {
			sChars += s.charAt(i);
			goalChars += goal.charAt(i);
			
			if(s.charAt(i) != goal.charAt(i)) {
                if( pos1 == 0 ) pos1 = i;
            else pos2 = i;
            counter++;
            }
			if(counter > 2) return false;
		}
		
		boolean val = counter <= 2 && (s.charAt(pos1) == goal.charAt(pos2) && s.charAt(pos2) == goal.charAt(pos1));
        
        return val; 
    }
}