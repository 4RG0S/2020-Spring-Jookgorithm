package Baekjoon.implementation;

import java.util.Scanner;

public class Baekjoon1292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		for(int i = 1; i < 50;i++) {
			for(int j = 1; j <= i; j++ ) {
				if(a == 1) {
					c += i;
				}else {
					a--;
				}
				if(b == 1) {
					System.out.print(c);
					System.exit(0);
				}
				b--;
			}
		}
	}
}
