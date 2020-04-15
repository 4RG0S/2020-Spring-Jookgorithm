package Fourth_week;

import java.util.Arrays;
import java.util.Scanner;

public class April_16_10815 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];
		scan.nextLine();
		String line = scan.nextLine();
		String split[] = line.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
			arr[i] = Integer.parseInt(split[i]);
		}
		Arrays.sort(arr);
		int M = scan.nextInt();
		scan.nextLine();
		line = scan.nextLine();
		String se_split[] = line.split(" ");
		for(int i=0;i<se_split.length;i++)
		{
			if(Arrays.binarySearch(arr, Integer.parseInt(se_split[i])) >= 0)
				System.out.print("1" + " ");
			else
				System.out.print("0" + " ");
		}
	}

}
