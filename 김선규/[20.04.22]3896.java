package Baekjoon.implementation;

import java.util.Scanner;

public class Baekjoon3896 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		boolean[] a = new boolean[1299710];
		for(int i = 2; i <= 1299709; i++) {
            a[i] = true;
        }
    
        for(int i = 2; i*i <= 1299709; i++) {
            for(int j = i*i; j <= 1299709; j+=i) {
                a[j] = false;
            }
        }
		for(int z = 0; z < t; z++) {
			int k = sc.nextInt();
			if(a[k]) {
				System.out.println(0);
			}else {
				int c = 0;
				int n = 1;
				for(int i = 2; i < 1299709; i++) {
					c++;
					if(!a[i]) {continue;}
					if(n < k & k < i) {break;}
					if(a[i]) {c = 0;}
					n = i;
				}
				System.out.println(c);
			}
		}
	}
}
