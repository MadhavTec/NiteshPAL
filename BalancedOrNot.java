package nit;

import java.util.Scanner;
import java.util.Stack;

public class BalancedOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String expression = scanner.next();
		boolean output = isBalanced(expression);
	}
	

	public static boolean isBalanced(String expression) {

		// Must be even
		if ((expression.length() & 1) == 1) return false;
		else {
		  char[] brackets = expression.toCharArray();
		  Stack<Character> s = new Stack<>();
		  for (char bracket : brackets)
		    switch (bracket) {
		      case '{': s.push('}'); break;
		      case '(': s.push(')'); break;
		      case '[': s.push(']'); break;
		      default :
		        if (s.empty() || bracket != s.peek())
		          return false;
		        s.pop();
		    }
		  return s.empty();
		}

	}
}
