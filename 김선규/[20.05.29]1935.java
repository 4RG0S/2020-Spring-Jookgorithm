package Baekjoon.solve_01000;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon1935 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		int[] num = new int[n];
		for(int i = 0; i < n; i++)
			num[i] = sc.nextInt();
		Stack<Double> st = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			double b, f;
			switch(s.charAt(i)) {
			case '+':
				st.push(st.pop() + st.pop());
				break;
			case '-':
				b = st.pop();
				f = st.pop();
				st.push(f - b);
				break;
			case '*':
				st.push(st.pop() * st.pop());
				break;
			case '/':
				b = st.pop();
				f = st.pop();
				st.push(f / b);
				break;
			case '%':
				b = st.pop();
				f = st.pop();
				st.push(f % b);
				break;
			case '^':
				b = st.pop();
				f = st.pop();
				st.push(Math.pow(f, b));
				break;
			default:
				st.push((double) num[(int)s.charAt(i)-65]);
			}
		}
		System.out.print(String.format("%.2f", st.pop()));
	}
}
