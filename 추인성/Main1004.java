import java.util.Scanner;

public class Main1004 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main1004 main = new Main1004();
		
		// 받은 수 만큼 횟수를 시행
		int n = input.nextInt();
		int[] result = new int[n];
		
		for(int i=0;i<n;i++) {
			
			//출발점
			int x1 = input.nextInt();
			int y1 = input.nextInt();
			
			//목표점
			int x2 = input.nextInt();
			int y2 = input.nextInt();
			
			int count = input.nextInt();
			
			//원의 중심과 반지름
			int[] x = new int[count];
			int[] y = new int[count];
			int[] radius = new int[count];
			
			for(int j=0;j<count;j++) {
				x[j] = input.nextInt();
				y[j] = input.nextInt();
				radius[j] = input.nextInt();
				
				//double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));

				//출발점과 원의 중심과의 거리
				double distance1 = Math.sqrt(Math.pow(x1-x[j], 2) + Math.pow(y1-y[j], 2));
				
				//목표점과 원의 중심과의 거리
				double distance2 = Math.sqrt(Math.pow(x2-x[j], 2) + Math.pow(y2-y[j], 2));
				
				if((distance1<radius[j] && distance2>radius[j]) || (distance1>radius[j] && distance2<radius[j])) {
					result[i] += 1;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(result[i]);
		}
	}
}
