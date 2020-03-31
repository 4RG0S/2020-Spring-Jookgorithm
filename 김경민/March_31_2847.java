package Second_week;

import java.util.Scanner;

public class March_31_2847 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N,cnt = 0;
		int level[] = new int[101];
		N = scan.nextInt();
		for (int i = 1; i < N + 1; i++) {
			level[i] = scan.nextInt();
		}
		int score = level[N];
		
		for (int i = N - 1; i > 0; i--) {
			while (level[i] >= score) {
				level[i] -= 1;
				cnt++;
			}
			score = level[i];
		}
		System.out.println(cnt);
	}

}
