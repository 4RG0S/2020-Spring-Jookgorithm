package First_week;

import java.util.Scanner;

public class March_26_1041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		int arr[] = new int[6];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int second_min = Integer.MAX_VALUE;
		int third_min = Integer.MAX_VALUE;
		int min_index = 0;
		int second_min_index = 0;
		long sum = 0;
		
		for(int i=0;i<6;i++)
		{
			arr[i] = scan.nextInt();
			if (arr[i] < min)
			{
				min = arr[i];
				min_index = i;
			}
			if (arr[i] > max)
				max = arr[i];
			sum += arr[i];
		}
		for(int i=0;i<6;i++)
		{
			if((i == min_index) || (i == 5 - min_index))
				continue;
			if (second_min > arr[i])
			{
				second_min = arr[i];
				second_min_index = i;
			}
		}
		for(int i=0;i<6;i++)
		{
			if((i == min_index) || (i == 5 - min_index) || (i == second_min_index) || (i == 5 - second_min_index))
				continue;
			if (third_min > arr[i])
				third_min = arr[i];
		}
		int two_min = min + second_min;
		int three_min = min + second_min + third_min;
		if (N == 1)
			System.out.println(sum - max);
		else {
			long result = 0;
			result += (N - 2) * (N - 2) * 5 * min;
			result += (N - 2) * 8 * two_min;
			result += (N - 2) * 4 * min;
			result += 4 * three_min;
			result += 4 * two_min;
			System.out.println(result);
		}
			
	}

}
