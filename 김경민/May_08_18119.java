package Seventh_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class May_08_18119 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String int_split[] = input.split(" ");
		int N = Integer.parseInt(int_split[0]);
		int M = Integer.parseInt(int_split[1]);
		int bit_mask[] = new int[N];
		int memory = (int)(Math.pow(2, 26) - 1);
		for(int i=0;i<N;i++)
		{
			String line = br.readLine();
			for(int j=0;j<26;j++)
			{
				if(line.indexOf('a' + j) != -1)
				{
					bit_mask[i] += (int)Math.pow(2, 25 - j);
				}
			}
		}
		for(int i=0;i<M;i++)
		{
			String line = br.readLine();
			int num = line.charAt(0) - '0';
			char character = line.charAt(2);
			int count = 0;
			if(num == 1)
			{
				memory -= (int)Math.pow(2, 25 - (character - 'a'));
			}
			else if(num == 2)
			{
				memory += (int)Math.pow(2, 25 - (character - 'a'));
			}
			for(int j=0;j<N;j++)
			{
				if((bit_mask[j] & memory) == bit_mask[j])
					count++;
			}
			System.out.println(count);
		}
	}

}
