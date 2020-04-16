package Baekjoon.Bruteforce;

import java.util.Scanner;

public class Baekjoon1145 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[5];
		for(int i = 0; i < 5; i++) {
			n[i] = sc.nextInt();
		}
		int num = 0;
		for(int i = 1; i < 1000000; i++) {
			int c = 0;
			for(int j = 0; j < 5; j++) {
				if(i % n[j] == 0) {
					c++;
				}
			}
			if(c >= 3) {
				num = i;
				break;
			}
		}
		System.out.print(num);
	}
}
