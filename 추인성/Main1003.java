import java.util.Scanner;

public class Main1003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main1003 main = new Main1003();
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int[] count = new int[n];

		for (int i = 0; i < n; i++) {
			count[i] = input.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int[][] arr = new int[count[i] + 1][2];

			arr[0][0] = 1;
			arr[0][1] = 0;
			if (count[i] >= 1) {
				arr[1][0] = 0;
				arr[1][1] = 1;
			}

			main.recurse(arr, count[i]);

			System.out.print(arr[count[i]][0] + " ");
			System.out.print(arr[count[i]][1]);
			System.out.println("");
		}

		input.close();
	}

	public void recurse(int[][] arr, int n) {

		if (n < 2) {
			return;
		}

		recurse(arr, n - 1);
		arr[n][0] = arr[n - 1][0] + arr[n - 2][0];
		arr[n][1] = arr[n - 1][1] + arr[n - 2][1];
	}

}
