package Baekjoon.Bruteforce;

import java.util.Scanner;

public class Baekjoon1182 {
	static int count = 0;
	static int S;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		S = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++)
			A[i] = sc.nextInt();
		func(A,0,0);
		if(S == 0) {
			count--;
		}
		System.out.print(count);
	}
	
	public static void func(int[] arr,int index, int sum) {
		if(index == arr.length) {
			if(S == sum) {
				count++;
			}
			return;
		}
		func(arr,index+1,sum);
		func(arr,index+1,sum+arr[index]);
	}
}
