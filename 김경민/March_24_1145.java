package First_week;

import java.util.Scanner;

public class March_24_1145 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int count;
		int i;
		for(int j=0;j<5;j++)
		{
			arr[j]=scan.nextInt();
		}
		for(i=1;i<1000000;i++)
		{
			count = 0;
			for(int j=0;j<5;j++)
			{
				if(i % arr[j] == 0)
					count++;
			}
			if(count >= 3)
				break;
		}
		System.out.println(i);
	}

}
