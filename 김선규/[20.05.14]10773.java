package Baekjoon.Char;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		Stack<Integer> s = new Stack<>();
		for(int i = 0; i < k; i++) {
			int n = sc.nextInt();
			if(n == 0 && s.empty()) {
				continue;
			}else if(n == 0) {
				s.pop();
			}else {
				s.push(n);
			}
		}
		int add = 0;
		for(int i = 0; i < s.size(); i=i) {
			add += s.pop();
		}
		System.out.print(add);
	}
}
