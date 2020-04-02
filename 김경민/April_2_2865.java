package Second_week;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class April_2_2865 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int K = scan.nextInt();
		Double scores[][] = new Double[N][M];
		Double best[] = new Double[N];
		double sum = 0;
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				int num = scan.nextInt();
				double score = scan.nextDouble();
				scores[num-1][i]=score;
			}
		}
		for(int i = 0;i<N;i++)
		{
			Arrays.sort(scores[i], Collections.reverseOrder());
			best[i] = scores[i][0];
		}
		Arrays.sort(best, Collections.reverseOrder());
		for(int i=0;i<K;i++)
		{
			sum+=best[i];
		}
		System.out.printf("%.1f",sum);
	}

}
