package First_week;

import java.util.Scanner;

public class March_23_1912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max = Integer.MIN_VALUE;
		int temp = 0;
		scan.nextLine();
		int arr[] = new int[n];
		int j;
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			temp = 0;
			j = i;
			while(j < n)
			{
				temp += arr[j];
				if (temp > max)
					max = temp;
				if (temp < 0)
					break;
				j++;
			}
		}
		System.out.println(max);
	}

}
