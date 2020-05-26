package Baekjoon.solve_05000;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon6198 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		long sum = 0;
		while(n-->0) {
			int num = sc.nextInt();
			while(!st.isEmpty()) {
				if(st.peek() <= num) {
					st.pop();
				}else {
					break;
				}
			}
			sum += st.size();
			st.push(num);
		}
		System.out.print(sum);
	}
}
