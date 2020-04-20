package Fifth_week;

import java.util.Scanner;
import java.util.Stack;

public class April_20_1107 {
	
	public static boolean isOkay(int num, int arr[])
	{
		String number = Integer.toString(num);
		for(int i=0;i<number.length();i++)
		{
			int temp = number.charAt(i) - '0';
			if(arr[temp] != 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int up = 100;
		int down = 100;
		int now = 100;
		int arr[] = new int[10];
		for(int i=0;i<M;i++)
		{
			int input = scan.nextInt();
			arr[input] = -1;
		}
		int temp = N;
		while(temp <= N + 500000)
		{
			if(isOkay(temp, arr))
			{
				up = temp;
				break;
			}
			temp++;
		}
		temp = N;
		while(temp >= 0)
		{
			if(isOkay(temp, arr))
			{
				down = temp;
				break;
			}
			temp--;
		}

		int result = Integer.MAX_VALUE;
		int a = Integer.toString(up).length() + (Math.abs(N - up));
		int b = Integer.toString(down).length() + (Math.abs(N - down));
		result = Integer.min(a, b);
		result = Integer.min(result, Math.abs(now - N));
		System.out.println(result);
	}

}
