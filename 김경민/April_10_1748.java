package Third_week;

import java.util.Scanner;

public class April_10_1748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long count = 0;
		
		for(int i=1;i<=N;i*=10)
			count += N - i + 1;
		System.out.println(count);
	}

}
