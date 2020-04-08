package Third_week;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class April_8_1918 {

	public static char sign[] = { '+', '-', '*', '/' };

	public static int prev(char input) {
		if (input == '(')
			return 0;
		else if (input == '+' || input == '-')
			return 1;
		else
			return 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String result = "";

		for (char ch : line.toCharArray()) {
			if ('A' <= ch && ch <= 'Z')
				result += ch;
			else if (ch == '(')
				stack.push(ch);
			else if (ch == ')') {
				while (!stack.isEmpty()) {
					char c = stack.pop();
					if (c == '(')
						break;
					result += c;
				}
			} else {
				while(!stack.isEmpty() && prev(stack.peek()) >= prev(ch))
					result += stack.pop();
				stack.push(ch);
			}
		}
		while(!stack.isEmpty())
			result += stack.pop();
		System.out.println(result);
	}

}
