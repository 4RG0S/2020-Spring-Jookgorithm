package Baekjoon.solve_03000;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon3986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		while(n-->0) {
			String s = sc.next();
			Stack<Character> st = new Stack<>();
			for(int i = 0; i < s.length(); i++) {
				if(st.isEmpty()) {
					st.push(s.charAt(i));
				}else {
					if(st.peek() == s.charAt(i)) {
						st.pop();
					}else {
						st.push(s.charAt(i));
					}
				}
			}
			if(st.isEmpty()) {
				count++;
			}
		}
		System.out.print(count);
	}
}
