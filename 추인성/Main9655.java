import java.util.Scanner;

public class Main9655 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stone = sc.nextInt();
		int num = 0;
		
		while(stone!=0) {
			if(stone%3 != 0) {
				stone -= 1;
			} else {
				stone -= 3;
			}
			num++;
		}
		
		if(num%2 == 0) {
			System.out.println("CY");
		} else {
			System.out.println("SK");
		}
	}
}