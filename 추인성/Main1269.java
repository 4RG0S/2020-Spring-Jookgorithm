import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1269 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int countA = input.nextInt();
		int countB = input.nextInt();
		
		int count = 0;
		
		Set<Integer> hash = new HashSet<Integer>();
		
		for(int i=0;i<countA;i++) {
			hash.add(input.nextInt());
		}
		
		for(int i=0;i<countB;i++) {
			int b = input.nextInt();
			if(hash.contains(b)) {
				count++;
			}
		}
		
		System.out.println(countA+countB-count*2);
	}
}
