package May;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class May_27_1235 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		String arr[] = new String[N];
		
		for(int i=0;i<N;i++)
		{
			arr[i] = scan.nextLine();
		}
		int start = arr[0].length();
		HashSet<String> set = new HashSet<>();
		while(true)
		{
			start--;
			boolean isExit = false;
			for(int i=0;i<N;i++)
			{
				if(!set.contains(arr[i].substring(start)))
				{
					set.add(arr[i].substring(start));
				}
				else
				{
					isExit = true;
					break;
				}
			}
			if(!isExit)
			{
				System.out.println(arr[0].length() - start);
				break;
			}
		}
	}

}
