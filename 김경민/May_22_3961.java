package May;

import java.util.Arrays;
import java.util.Scanner;

class word implements Comparable<word>{
	String word;
	int distance;
	public word(String word, int distance)
	{
		this.word = word;
		this.distance = distance;
	}
	@Override
	public int compareTo(word comp) {
		if(comp.distance < this.distance)
			return 1;
		else if(comp.distance > this.distance)
			return -1;
		else
			return this.word.compareTo(comp.word);
	}
	
	public String toString() {
		return this.word + " " + this.distance;
	}
	
}

public class May_22_3961 {
	
	public static int distance(char arr[][], char find, char input)
	{
		int f_x = 0,f_y = 0,i_x = 0,i_y = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j] == find)
				{
					f_x = j;
					f_y = i;
				}
				if(arr[i][j] == input)
				{
					i_x = j;
					i_y = i;
				}
			}
		}
		return Math.abs(f_x - i_x) + Math.abs(f_y - i_y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		char keyboard[][] = {
				{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'},
				{'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', ' '},
				{'z', 'x', 'c', 'v', 'b', 'n', 'm', ' ', ' ', ' '}
				};
		scan.nextLine();
		for(int i=0;i<T;i++)
		{
			String word = scan.nextLine();
			String split[] = word.split(" ");
			word arr[] = new word[Integer.parseInt(split[1])];
			int arr_count = 0;
			for(int j=0;j<Integer.parseInt(split[1]);j++)
			{
				String line = scan.nextLine();
				int count = 0;
				for(int k=0;k<line.length();k++)
				{
					count += distance(keyboard, split[0].charAt(k), line.charAt(k));
				}
				arr[arr_count] = new word(line, count);
				arr_count++;
			}
			Arrays.sort(arr);
			for(int j=0;j<arr.length;j++)
			{
				System.out.println(arr[j]);
			}
		}
	}

}
