package Fifth_week;

import java.util.Scanner;

class Chicken{
	int map[][];
	int x;
	int y;
	int chicken_distance[][];
	
	public Chicken(int map[][], int x, int y) {
		this.map = map;
		this.x = x;
		this.y = y;
		chicken_distance = new int[map.length][map.length];
		chicken_distance_init(x, y);
	}
	public void chicken_distance_init(int x, int y) {
		for(int i=0;i<map.length;i++)
		{
			for(int j=0;j<map.length;j++)
			{
				if(map[i][j] == 1)
					chicken_distance[i][j] = (Math.abs(x - j) + Math.abs(y - i));
			}
		}
	}
}

public class April_23_15686 {
	
	static int count_comb = 0;
	static int global_index = 0;
	static int comb[][];
	
	private static void count_comb(int[] comArr, int n, int r, int index, int target) {
        if(r==0){
          count_comb++;
          return;
        }
        if(target == n)return;
         
        comArr[index] = target;
        count_comb(comArr, n, r-1, index+1, target+1);//뽑는경우
        count_comb(comArr, n, r, index, target+1);//안뽑는경우
         
    }
	
	private static void combination(int[] comArr, int n, int r, int index, int target) {
        if(r==0){
        	int count = 0;
        	for(int i : comArr){
        		comb[global_index][count] = i;
        		count++;
            }
         global_index++;
         return;
        }
        if(target == n)return;
         
        comArr[index] = target;
        combination(comArr, n, r-1, index+1, target+1);//뽑는경우
        combination(comArr, n, r, index, target+1);//안뽑는경우
         
    }
	
	public static int sum_distance(Chicken arr[], int num[], int BBQ)
	{
		int sum = 0;
		for(int i=0;i<arr[0].map.length;i++)
		{
			for(int j=0;j<arr[0].map.length;j++)
			{
				int min = Integer.MAX_VALUE;
				for(int k=0;k<num.length;k++)
				{
					int temp = num[k];
					if(arr[temp].chicken_distance[i][j] < min)
						min = arr[temp].chicken_distance[i][j];
				}
				sum += min;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int arr[][] = new int[N][N];
		
		int BBQ = 0;
		scan.nextLine();
		for(int i=0;i<N;i++)
		{
			String line = scan.nextLine();
			String split[] = line.split(" ");
			for(int j=0;j<split.length;j++)
			{
				arr[i][j] = Integer.parseInt(split[j]);
				if(arr[i][j] == 2)
					BBQ++;
			}
		}
		
		Chicken store[] = new Chicken[BBQ];
		int count = 0;
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(arr[i][j] == 2)
				{
					store[count] = new Chicken(arr, j, i);
					count++;
				}
			}
		}
		
		int[] comArr = new int[M];
		count_comb(comArr, BBQ, M, 0, 0);
		comb = new int[count_comb][M];
		int[] combArr = new int[M];
		combination(combArr, BBQ, M, 0, 0);
		int min = Integer.MAX_VALUE;
		for(int i=0;i<count_comb;i++)
		{
			int sum = sum_distance(store, comb[i], BBQ);
			if(sum < min)
			{
				min = sum;
			}
		}
		System.out.println(min);
		
	}

}
