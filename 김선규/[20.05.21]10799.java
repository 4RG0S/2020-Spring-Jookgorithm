package Baekjoon.solve_10000;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon10799 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		Stack<Character> st = new Stack<>();
		int num = 0;
		int c = 0;
		for(int i = 0; i < s.length(); i++) {
			c++;
			if(s.charAt(i) == '(') {
				st.push('(');
				c = 0;
			}else {
				st.pop();
				if(c == 1) {
					num += st.size();
				}else {
					num++;
				}
			}
		}
		System.out.print(num);
	}
}
