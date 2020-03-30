package First_week;

import java.util.Scanner;

public class March_25_1543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String first_line = scan.nextLine();
		String second_line = scan.nextLine();
		int result = 0;
		int count = 0;
		for(int i=0;i<first_line.length();i++)
		{
			if (first_line.charAt(i) == second_line.charAt(count))
				count++;
			else
			{
				i -= count;
				count = 0;
			}

			if (count == second_line.length())
			{
				result++;
				count = 0;
			}
		}
		System.out.println(result);
	}

}
