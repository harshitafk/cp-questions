class Solution {
    public String maxValue(String n, int x) {
   
		StringBuilder appendString = new StringBuilder();
		
		String xString = String.valueOf(x);
		char charValue = xString.charAt(0);
		boolean negativeNumber = false;
		if(n.charAt(0) == ('-')) {
			negativeNumber = true;
		}
		int getPlace = n.length();

		if(negativeNumber == false) {
			for(int i = 0; i < n.length(); i++) {
				char getChar = n.charAt(i);
				if(charValue > getChar) {
					getPlace = i;
					break;
				}
			}	
		}else if(negativeNumber == true){
			for(int i = 0; i < n.length(); i++) {
				char getChar = n.charAt(i);
				if(charValue < getChar) {
					getPlace = i;
					break;
				}
			}	
		}
		
		if(getPlace != n.length()) {
		for(int i = 0; i < n.length(); i++) {
			if(getPlace == i) {
				appendString.append(charValue);
				appendString.append(n.charAt(i));
			}else {
				appendString.append(n.charAt(i));
			}
		}
		}else {
			for(int i = 0; i < n.length(); i++)
				appendString.append(n.charAt(i));
			
			appendString.append(charValue);
		}
		
		
		return appendString.toString();
    }
}