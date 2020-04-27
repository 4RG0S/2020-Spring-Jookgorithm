package Sixth_week;

import java.util.Scanner;

class floor{
	int one, two, max;
	public floor(int one)
	{
		this.one = one;
		this.max = one;
	}
	public floor(int one, int two)
	{
		this.one = one;
		this.two = two;
		max = Integer.max(one, two);
	}
}

public class April_27_2579 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];
		floor value[] = new floor[N];
		for(int i=0;i<N;i++)
		{
			arr[i] = scan.nextInt();
		}
		if(N > 0)
			value[0] = new floor(arr[0]);
		if(N > 1)
		value[1] = new floor(arr[1], arr[0] + arr[1]);
		for(int i=2;i<N;i++)
		{
			value[i] = new floor(value[i - 2].max + arr[i], value[i - 1].one + arr[i]);
		}
		System.out.println(value[N - 1].max);
	}

}
