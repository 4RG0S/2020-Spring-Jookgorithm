package Fifth_week;

import java.util.Scanner;

public class April_24_1074 {
	
	static int dx[] = {0, 1, 0, 1};
	static int dy[] = {0, 0, 1, 1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int r = scan.nextInt();
		int c = scan.nextInt();
		
		int arr[] = new int[16];
		int result = 0;
		arr[0] = 4;
		for(int i=1;i<16;i++)
		{
			arr[i] = arr[i - 1] * 4;
		}
		int count = -1;
		int max = Integer.max(r, c);
		while(max > 0)
		{
			max /= 2;
			count++;
		}
		while(true)
		{
			int x = 0;
			int y = 0;
			if(count > 0) {
				x = c / (int)Math.pow(2, count) == 0 ? 0 : 1;
				y = r / (int)Math.pow(2, count) == 0 ? 0 : 1;
			}
			else
			{
				for(int i=0;i<4;i++)
				{
					if(c == dx[i] && r == dy[i])
					{
						result = i;
					}
				}
				break;
			}
			int rx = c % 2;
			int ry = r % 2;
			if(c >= 2)	c %= (int)Math.pow(2, count);
			if(r >= 2)	r %= (int)Math.pow(2, count);
			for(int i=0;i<4;i++)
			{
				if(x == dx[i] && y == dy[i])
				{
					result += arr[count - 1] * i;
					count--;
				}
			}
			if(c < 2 && r < 2)
			{
				for(int i=0;i<4;i++)
				{
					if(rx == dx[i] && ry == dy[i])
					{
						result += i;
					}
				}
				break;
			}
		}
		System.out.println(result);
	}

}
