package ValidateParam;

import java.util.Stack;

public class ValidateBalancedParentheses {

	public static void main(String[] args) {
		String exp = "[()]{}{[()()]()}";
		String exp1 = "[(])";
		if(areBracketsBalanced(exp1)) 
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}

	private static boolean areBracketsBalanced(String exp) {
		Stack st = new Stack();
		for(int i=0; i< exp.length();i++) {
			char data = exp.charAt(i);
			if(data == '[' || data == '(' || data == '{') {
				st.push(data);
				continue;
			}
			if(!st.isEmpty()) {
				char checkElement = (char) st.pop();
				switch(data) {
				case ')' :
					if(checkElement == '[' || checkElement == '{' )
						return false;
					break;
				case ']' :
					if(checkElement == '(' || checkElement == '{' )
						return false;
					break;
				case '}' :
					if(checkElement == '[' || checkElement == '(' )
						return false;
					break;
				}
			}
		}
		return st.isEmpty();
	}
}