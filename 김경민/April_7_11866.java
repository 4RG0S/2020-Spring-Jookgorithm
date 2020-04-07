package Third_week;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class April_7_11866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int arr[] = new int[N];
		int isKilled[] = new int[N];
		int kill = 0;
		int count = 0;
		int index = 0;
		System.out.print("<");
		for(int i=0;i<N;i++)
		{
			arr[i] = i + 1;
		}
		while(kill != N)
		{
			count = 0;
			while(true)
			{
				if(isKilled[index] == 0 && count != K)
					count++;
				if(isKilled[index] == 0 && count == K)
				{
					isKilled[index] = 1;
					System.out.print(arr[index]);
					if(kill != N-1)
						System.out.print(", ");
					kill++;
					break;
				}
				index = (index + 1) % N;
			}
		}
		System.out.print(">");
	}

}
