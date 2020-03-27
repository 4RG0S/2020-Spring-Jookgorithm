package First_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class March_27_10989 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		String line = br.readLine();
		int N = Integer.parseInt(line);
		int arr[]=new int[10001];
		int max = Integer.MIN_VALUE;
		for(int i=0;i<N;i++)
		{
			int input = Integer.parseInt(br.readLine());
			arr[input]++;
			if (input > max)
				max = input;
		}
		for(int i=1;i<=max;i++)
		{
			for(int j=0;j<arr[i];j++)
			{
				System.out.println(i);
			}
		}
	}

}
