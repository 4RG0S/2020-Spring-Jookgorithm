package Baekjoon.Dynamic;

import java.util.Scanner;

public class Baekjoon9095 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] DP = new int[11];
		DP[0] = 1;
		DP[1] = 2;
		DP[2] = 4;
		for(int i = 3; i < 11; i++)
			DP[i] = DP[i-1] + DP[i-2] + DP[i-3];
		int num = input.nextInt();
		for(int i = 0; i < num; i++)
			System.out.println(DP[input.nextInt()-1]);
	}
}
