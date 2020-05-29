package May;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class May_29_5052 {
	
	public static boolean isPre(String origin, String comp)
	{
		int min = Integer.min(origin.length(), comp.length());
		if(comp.substring(0, min).equals(origin))
			return true;
		else
			return false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			boolean consist = true;
			int N = Integer.parseInt(br.readLine());
			String arr[] = new String[N];
			for (int j = 0; j < N; j++) {
				arr[j] = br.readLine();
			}
			Arrays.sort(arr);
			for (int j = 0; j < N - 1; j++) {
				if(isPre(arr[j], arr[j + 1]))
					consist = false;
			}
			if(consist)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
