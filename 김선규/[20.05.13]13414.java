package Baekjoon.Sort;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Stack;

public class Baekjoon13414 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int l = sc.nextInt();
		Stack<String> s = new Stack<>();
		for(int i = 0; i < l; i++)
			s.push(sc.next());
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for(int i = 1; i <= l; i++)
			set.add(s.pop());
		
		for(String c: set) {
			s.push(c);
		}
		
		for(int i = 1; i <= k; i++) {
			System.out.println(s.pop());
			if(s.empty())
				break;
		}
	}
}
