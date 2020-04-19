package Fourth_week;

import java.util.Arrays;
import java.util.Scanner;

class Party implements Comparable<Party>{
	String name;
	int seat;
	public Party(String name, int seat)
	{
		this.name = name;
		this.seat = seat;
	}
	public String toString() {
		return this.name + " " + this.seat;
	}
	@Override
	public int compareTo(Party comp) {
		if(this.seat < comp.seat)
			return 1;
		else if(this.seat > comp.seat)
			return -1;
		else if(this.name.compareTo(comp.name) > 0)
			return 1;
		else if(this.name.compareTo(comp.name) < 0)
			return -1;
		else
			return 0;
	}
}

public class April_18_18891 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int P = scan.nextInt();
		int V = scan.nextInt();
		int valid_V = 0;
		int R = 253;
		String arr[][] = new String[P][3];
		int s[] = new int[P];
		double ratio[] = new double[P];
		int seat = 0;
		scan.nextLine();
		for(int i=0;i<P;i++)
		{
			String line = scan.nextLine();
			arr[i] = line.split(" ");
			
			double temp = Double.parseDouble(arr[i][2])/V;
			if(temp >= 0.03 || Integer.parseInt(arr[i][1]) >= 5)
			{
				valid_V += Integer.parseInt(arr[i][2]);
				R -= Integer.parseInt(arr[i][1]);
			}
		}
		for(int i=0;i<P;i++)
		{
			double tp = Double.parseDouble(arr[i][2])/V;
			if(tp >= 0.03 || Integer.parseInt(arr[i][1]) >= 5) {
				ratio[i] = Double.parseDouble(arr[i][2])/valid_V;
				double temp = ((double)(300 - R) * ratio[i] - Integer.parseInt(arr[i][1])) / 2;
				if(temp < 1)
					temp = 0;
				else
					temp = Math.round(temp);
				s[i] += temp;
				seat += temp;
			}
		}
		if(seat < 30)
		{
			double temp[] = new double[P];
			for(int i=0;i<P;i++)
			{
				temp[i] = (30 - seat) * ratio[i];
			}
			for(int i=0;i<P;i++)
			{
				s[i] += (int)temp[i];
				seat += (int)temp[i];
				temp[i] -= (int)temp[i];
			}
			while(seat != 30)
			{
				double max = 0;
				int index = -1;
				for(int i=0;i<P;i++)
				{
					if(max < temp[i])
					{
						max = temp[i];
						index = i;
					}
				}
				if(index != -1)
				{
					seat += 1;
					s[index] += 1;
					temp[index] = 0;
				}
			}
		}
		else if(seat > 30)
		{
			double temp[] = new double[P];
			for(int i=0;i<P;i++)
			{
				temp[i] = (double)(30 * s[i]) / seat;
			}
			seat = 0;
			for(int i=0;i<P;i++)
			{
				s[i] = (int)temp[i];
				seat += (int)temp[i];
				temp[i] -= (int)temp[i];
			}
			while(seat != 30)
			{
				double max = 0;
				int index = -1;
				for(int i=0;i<P;i++)
				{
					if(max < temp[i])
					{
						max = temp[i];
						index = i;
					}
				}
				if(index != -1)
				{
					seat += 1;
					s[index] += 1;
					temp[index] = 0;
				}
			}
		}
		if(seat == 30)
		{
			double temp[] = new double[P];
			for(int i=0;i<P;i++)
			{
				temp[i] = (double)17 * ratio[i];
			}
			for(int i=0;i<P;i++)
			{
				s[i] += (int)temp[i];
				seat += (int)temp[i];
				temp[i] -= (int)temp[i];
			}
			while(seat != 47)
			{
				double max = 0;
				int index = -1;
				for(int i=0;i<P;i++)
				{
					if(max < temp[i])
					{
						max = temp[i];
						index = i;
					}
				}
				if(index != -1)
				{
					seat += 1;
					s[index] += 1;
					temp[index] = 0;
				}
			}
		}
		Party result[] = new Party[P];
		for(int i=0;i<P;i++)
		{
			result[i] = new Party(arr[i][0], s[i] + Integer.parseInt(arr[i][1]));
		}
		Arrays.sort(result);
		for(int i=0;i<P;i++)
		{
			System.out.println(result[i]);
		}
	}

}
