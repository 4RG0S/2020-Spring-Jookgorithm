package May;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class May_12_7453 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[][] = new int[4][n];
		int ab[] = new int[(int)Math.pow(n, 2)];
		int cd[] = new int[(int)Math.pow(n, 2)];
		for(int i=0;i<n;i++)
		{
			StringTokenizer line = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<4;j++)
			{
				arr[j][i] = Integer.parseInt(line.nextToken());
			}
		}
		int count = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				ab[count] = -(arr[0][i] + arr[1][j]);
				count++;
			}
		}
		count = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				cd[count] = arr[2][i] + arr[3][j];
				count++;
			}
		}
		Arrays.sort(cd);
		
		int left = 0, right = (int)Math.pow(n, 2);
		long ans = 0;
	 
	    for (int i = 0; i < (int)Math.pow(n, 2); ++i) {
	 
	        while (left < right) {
	            int mid = (left + right) / 2;
	 
	            if (ab[i] > cd[mid])
	                left = mid + 1;
	            else
	                right = mid;
	        }
	 
	        int lo = right;
	        //int lo2 = lower_bound(cd, cd + nn, ab[i]) - cd;
	 
	        left = 0; right = (int)Math.pow(n, 2);
	        
	        while (left < right) {
	            int mid = (left + right) / 2;
	 
	            if (ab[i] >= cd[mid])
	                left = mid + 1;
	            else
	                right = mid;
	        }
	 
	        int hi = right;
	        //int hi2 = upper_bound(cd, cd + nn, ab[i]) - cd;
	 
	        ans += (long)(hi - lo);
	 
	        left = 0; right = (int)Math.pow(n, 2);
	    }
		System.out.println(ans);
	}

}
