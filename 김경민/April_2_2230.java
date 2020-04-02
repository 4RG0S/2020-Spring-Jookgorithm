package Second_week;

import java.util.Arrays;
import java.util.Scanner;

public class April_2_2230 {
	
	public static int upperBound(long arr[], int front, int rear, long key){
		int mid;
		if (arr[arr.length - 1] <= key)
			return arr.length;
		while(front<rear){
			mid = (front + rear) / 2;
			if(arr[mid] <= key) front = mid + 1;
			else rear = mid;
		}
		return rear;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long M = scan.nextLong();
		long num[] = new long[N];
		long value = Integer.MAX_VALUE;
		for(int i=0;i<N;i++)
		{
			num[i] = scan.nextLong();
		}
		Arrays.sort(num);
		if(M==0) {
			System.out.println(0);
		}
		else {
			for(int i=0;i<N;i++)
			{
				int temp = upperBound(num, i, N, num[i] + M -1);
				if(temp == N) continue;
				if(M <= num[temp] - num[i] && num[temp] - num[i] < value)
					value = num[temp] - num[i];
				if(M == value) break;
			}
			System.out.println(value);
		}
	}

}
