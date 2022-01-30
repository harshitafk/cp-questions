class Solution {
    public String minRemoveToMakeValid(String s) {
    Stack<CharPosition> stack = new Stack<>();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch != '(' && ch != ')') {
				result.append(ch);
			}

			if (ch == '(') {
				stack.push(new CharPosition(ch, i));
				result.append('*');
			} else if (ch == ')') {
				if (!stack.isEmpty()) {
					if(stack.peek() != null) {
						CharPosition charPos = stack.pop();
						result.append(')');
						result.replace(charPos.position, charPos.position+1,charPos.c+"");
					}else {
						result.append('*');
					}
				}else {
					result.append('*');
				}
			}
		}

		return result.toString().replace("*","");
	}

	public class CharPosition {
		char c;
		int position;

		public CharPosition(char c, int position) {
			this.c = c;
			this.position = position;
		}
	}
}