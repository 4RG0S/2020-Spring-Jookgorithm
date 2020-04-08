package Baekjoon.Sort;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		for(int i = 0; i < n; i++) {
			b.add(sc.nextInt());
		}
		a.sort(null);
		b.sort(null);
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += a.get(i)*b.get(n-i-1);
		}
		System.out.print(sum);
	}
}
