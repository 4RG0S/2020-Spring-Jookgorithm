package First_week;

import java.util.Arrays;
import java.util.Scanner;

public class March_28_3020 {
	
	public static int upperBound(int arr[], int front, int rear, int key){
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
	
	public static int lowerBound(int arr[], int front, int rear, int key){
		int mid;
		if (arr[arr.length - 1] < key)
			return arr.length;
		while(front<rear){
			mid = (front + rear) / 2;
			if(arr[mid] < key) front = mid + 1;
			else rear = mid;
		}
		return rear;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int H = scan.nextInt();
		int low[]=new int[N/2];
		int high[]=new int[N/2];
		int min = Integer.MAX_VALUE;
		int count = 1;
		for(int i=0;i<N/2;i++)
		{
			low[i]=scan.nextInt();
			high[i]=scan.nextInt();
		}
		Arrays.sort(low);
		Arrays.sort(high);
		for(int i=1;i<=H;i++)
		{
			int temp = low.length - (lowerBound(low, 0, low.length - 1, i));
			temp += high.length - (upperBound(high, 0, high.length - 1, H - i));
			if (min == temp)
				count++;
			else if (min > temp)
			{
				min = temp;
				count = 1;
			}
		}
		System.out.println(min+" "+count);
	}

}
