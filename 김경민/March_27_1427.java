package First_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class March_27_1427 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		String line = br.readLine();
		int index = 0;
		int arr[] = new int[line.length()];
		int max = 0;
		for(int i=0;i<line.length();i++)
		{
			max = Integer.MIN_VALUE;
			for(int j=0;j<line.length();j++)
			{
				if (line.charAt(j) > max && arr[j] == 0) {
					max = line.charAt(j);
					index = j;
				}
			}
			arr[index] = 1;
			System.out.print((char)max);
		}
	}

}
