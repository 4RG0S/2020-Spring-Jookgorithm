package Baekjoon.solve_05000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Baekjoon5883 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		HashSet<Integer> s = new HashSet<>();
		for(int i = 0; i < n; i++) {
			int j = sc.nextInt();
			a.add(j);
			s.add(j);
		}
		
		int max = 1;
		for(int i: s) {
			ArrayList<Integer> a2 = new ArrayList<>();
			for(int j = 0; j < n; j++) {
				a2.add(a.get(j));
			}
			while(a2.contains(i)) {
				a2.remove((Integer)i);
			}
			int c = 1;
			for(int j = 1; j < a2.size(); j++) {
				if(!a2.get(j).equals(a2.get(j-1))) {
					max = Math.max(max, c);
					c = 0;
				}
				c++;
			}
			max = Math.max(max, c);
		}
		System.out.print(max);
	}
}
