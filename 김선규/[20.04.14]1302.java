package Baekjoon.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1302 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		Arrays.sort(s);
		int max = 1;
		int num = 1;
		String maxS = s[0];
		for(int i = 1; i < n; i++) {
			if(!s[i-1].equals(s[i])) {
				if(num > max) {
					max = num;
					maxS = s[i-1];
				}
				num = 0;
			}
			num++;
		}
		if(num > max) {
			maxS = s[n-1];
		}
		System.out.print(maxS);
	}
}
