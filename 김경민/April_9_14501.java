package Third_week;

import java.util.Scanner;

public class April_9_14501 {

	public static String toBinary(int x, int len) {

		if (len > 0) {
			return String.format("%" + len + "s", Integer.toBinaryString(x)).replaceAll(" ", "0");
		}

		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int T[] = new int[N];
		int P[] = new int[N];
		int active = 0;

		for (int i = 0; i < N; i++) {
			T[i] = scan.nextInt();
			P[i] = scan.nextInt();
		}
		int result = (int) Math.pow(2, N) - 1;
		int max = Integer.MIN_VALUE;
		boolean exit = false;

		for (int i = result; i > 0; i--) {
			int temp = 0;
			String bin = toBinary(i, N);
			active = 0;
			exit = false;
			for (int j = 0; j < N; j++) {
				if (bin.charAt(j) == '1' && active <= 0 && N - T[j] - j >= 0) {
					active = T[j] - 1;
					temp += P[j];
				} else if (bin.charAt(j) == '0')
					active--;
				else {
					exit = true;
					break;
				}
			}
			if (!exit) {
				if (max < temp) {
					max = temp;
				}
			}
		}
		System.out.println(max);
	}

}
