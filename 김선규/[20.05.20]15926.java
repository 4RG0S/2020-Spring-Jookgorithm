package Baekjoon.solve_15000;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon15926{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		
		Stack<Integer> st = new Stack<>();
		st.push(-1);
		int max = 0;
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == '(') {
				st.push(i);
			}else {
				st.pop();
				if(!st.empty()) {
					max = Math.max(max, i - st.lastElement());
				}else {
					st.push(i);
				}
			}
		}
		System.out.print(max);
	}
}
