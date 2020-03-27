package First_week;

import java.util.Scanner;

public class March_23_1138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int index = 0;
		int arr[] = new int[N];
		int result[] = new int[N];
		int temp;
		for(int i=0;i<N;i++)
		{
			arr[i] = 1;
		}
		for(int i=0;i<N;i++)
		{
			int order = scan.nextInt();
			temp = 0;
			for(int j = 0;j<N;j++)
			{
				if (temp == order && arr[j] == 1)
				{
					arr[j] = 0;
					result[j] = ++index;
					break;
				}
				temp += arr[j];
			}
		}
		for(int i=0;i<N;i++)
		{
			System.out.println(result[i]);
		}
	}

}
