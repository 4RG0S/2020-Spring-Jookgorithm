package Baekjoon.solve_10000;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		while(n-- != 0) {
			String s = sc.next();
			switch(s) {
			case "push":
				st.push(sc.nextInt());
				break;
			case "pop":
				if(st.empty()) {
					System.out.println(-1);
				}else {
					System.out.println(st.pop());
				}
				break;
			case "size":
				System.out.println(st.size());
				break;
			case "empty":
				if(st.empty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
			case "top":
				if(st.empty()) {
					System.out.println(-1);
				}else {
					System.out.println(st.lastElement());
				}
				break;
			}
		}
	}
}
