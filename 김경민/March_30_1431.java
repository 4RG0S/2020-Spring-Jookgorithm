package First_week;

import java.util.Arrays;
import java.util.Scanner;

class guitar implements Comparable<guitar>{
	String serial;
	public guitar(String serial)
	{
		this.serial = serial;
	}
	public int countNum(String serial)
	{
		int sum = 0;
		for(int i=0;i<serial.length();i++)
		{
			if('0' <= serial.charAt(i) && serial.charAt(i) <= '9')
			{
				sum += serial.charAt(i) - '0';
			}
		}
		return sum;
	}
	@Override
	public int compareTo(guitar comp) {
		if (comp.serial.length() > this.serial.length())
			return -1;
		else if (comp.serial.length() < this.serial.length())
			return 1;
		else if (comp.countNum(comp.serial) > this.countNum(this.serial))
			return -1;
		else if (comp.countNum(comp.serial) < this.countNum(this.serial))
			return 1;
		else if (comp.serial.compareTo(this.serial) > 0)
			return -1;
		else if (comp.serial.compareTo(this.serial) < 0)
			return 1;
		else
			return 0;
	}
	
}

public class March_30_1431 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		guitar arr[] = new guitar[N];
		for(int i=0;i<N;i++)
		{
			String input = scan.nextLine();
			arr[i] = new guitar(input);
		}
		Arrays.sort(arr);
		for(int i=0;i<N;i++)
		{
			System.out.println(arr[i].serial);
		}
	}

}
