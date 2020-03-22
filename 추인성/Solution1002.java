import java.util.Scanner;

public class Solution1002 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution1002 main = new Solution1002();
		
		int count = input.nextInt();
		
		main.solution(count);
		
		input.close();
	}

	public void solution(int count) {
		
		int[] res = new int[count];
		int index=0;
		
		while (count > 0) {
			int x1 = input.nextInt();
			int y1 = input.nextInt();
			int r1 = input.nextInt();

			int x2 = input.nextInt();
			int y2 = input.nextInt();
			int r2 = input.nextInt();
			
			int resultNum = encounteredNum(x1, y1, r1, x2, y2, r2);
			
			res[index] = resultNum;
			index+=1;

			count -= 1;
		}
		
		for(int i=0;i<index;i++) {
			System.out.println(res[i]);
		}
	}

	public int encounteredNum(int x1, int y1, int r1, int x2, int y2, int r2) {
//		int distanceSquared = (int)Math.pow(Math.abs(x2-x1), 2)+ (int)Math.pow(Math.abs(y2-y1), 2);
//		int distance = (int)Math.sqrt(distanceSquared);
		
		double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));
		
		if(x1==x2 && y1==y2 && r1==r2) {
			return -1;
		}
		else if(distance>r1+r2 || distance<Math.abs(r1-r2) || (x1==x2&&y1==y2&&r1!=r2)) {
			return 0;
		}
		else if(distance == r1+r2 || distance==Math.abs(r1-r2)) {
			return 1;
		}
		else{ //Math.abs(r1-r2)<distance && distance < (r1+r2)
			return 2;
		}
	}

}
