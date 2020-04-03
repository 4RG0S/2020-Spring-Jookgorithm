package Second_week;

import java.util.Arrays;
import java.util.Scanner;

public class April_4_9375 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0;i<T;i++)
		{
			int n = scan.nextInt();
			if(n == 0)
			{
				System.out.println(0);
				continue;
			}
			scan.nextLine();
			int arr[] = new int[n];
			int count = 0;
			int result = 1;
			String comp;
			String temp[] = new String[n];
			for(int j=0;j<n;j++)
			{
				String line = scan.nextLine();
				String split[] = line.split(" ");
				temp[j] = split[1];
			}
			Arrays.sort(temp);
			comp = temp[0];
			arr[count]++;
			for(int j=1;j<n;j++)
			{
				if(comp.compareTo(temp[j]) != 0)
				{
					comp = temp[j];
					count++;
					arr[count]++;
				}
				else
				{
					arr[count]++;
				}
			}
			for(int j=0;j<n;j++)
			{
				result *= (arr[j] + 1);
			}
			result -= 1;
			System.out.println(result);
		}
	}

}
