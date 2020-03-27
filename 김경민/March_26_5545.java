package First_week;

import java.util.Arrays;
import java.util.Scanner;

public class March_26_5545 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int arr[] = new int[N];
		int max = Integer.MIN_VALUE;
		int price;
		int cal;
		int per;
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		price = A;
		cal = C;
		if (max < cal / price)
			max = cal / price;
		for (int i = N - 1; i >= 0; i--) {
			price += B;
			cal += arr[i];
			per = cal / price;
			if (max < per)
				max = per;
		}
		System.out.println(max);
	}

}
