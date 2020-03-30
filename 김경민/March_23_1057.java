package First_week;

import java.util.Scanner;

public class March_23_1057 {
	public static boolean isMeet(int a, int b)
	{
		if (Math.abs(a/2 - b/2) == 1 && Math.abs(a - b) == 1)
		{
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int k_grade = 0, i_grade = 0;
		int N = scan.nextInt();
		int round = 1;
		k_grade = scan.nextInt();
		i_grade = scan.nextInt();
		while (!isMeet(k_grade, i_grade))
		{
			if (k_grade % 2 == 0)
				k_grade /= 2;
			else
				k_grade = k_grade / 2 + 1;
			
			if (i_grade % 2 == 0)
				i_grade /= 2;
			else
				i_grade = i_grade / 2 + 1;
			round++;
		}
		System.out.println(round);
	}

}
