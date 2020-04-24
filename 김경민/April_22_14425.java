package Fifth_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class April_22_14425 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String split[] = line.split(" ");
		int N = Integer.parseInt(split[0]);
		int M = Integer.parseInt(split[1]);
		int count = 0;
		
		HashSet<String> set = new HashSet<>();
		
		for(int i=0;i<N;i++)
		{
			String input = br.readLine();
			set.add(input);
		}
		for(int i=0;i<M;i++)
		{
			String input = br.readLine();
			if(set.contains(input))
				count++;
		}
		System.out.println(count);
	}

}
