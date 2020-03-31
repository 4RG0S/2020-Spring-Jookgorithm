package Second_week;

import java.util.Arrays;
import java.util.Scanner;

class Score implements Comparable<Score>
{
	int ko, en, math;
	String name;
	public Score(String name, int ko, int en, int math)
	{
		this.name = name;
		this.ko = ko;
		this.en = en;
		this.math = math;
	}
	@Override
	public int compareTo(Score comp) {
		if (comp.ko < this.ko)
			return -1;
		else if(comp.ko > this.ko)
			return 1;
		else if (comp.en > this.en)
			return -1;
		else if (comp.en < this.en)
			return 1;
		else if (comp.math < this.math)
			return -1;
		else if (comp.math > this.math)
			return 1;
		else if (comp.name.compareTo(this.name) > 0)
			return -1;
		else if (comp.name.compareTo(this.name) < 0)
			return 1;
		else
			return 0;
	}
}

public class March_31_10825 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Score arr[] = new Score[N];
		scan.nextLine();
		for(int i=0;i<N;i++)
		{
			String name = scan.next();
			int ko = scan.nextInt();
			int en = scan.nextInt();
			int math = scan.nextInt();
			scan.nextLine();
			arr[i] = new Score(name, ko, en, math);
		}
		Arrays.sort(arr);
		for(int i=0;i<N;i++)
		{
			System.out.println(arr[i].name);
		}
	}

}
