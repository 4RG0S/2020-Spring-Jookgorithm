import java.util.Arrays;
import java.util.Scanner;

public class Main1920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = input.nextInt();
		}
		
		Arrays.sort(a);
		
		int m = input.nextInt();
		int[] b = new int[m];
		
		Main1920 main = new Main1920();
		
		for(int i=0;i<m;i++) {
			b[i] = input.nextInt();
		}
		
		for(int i=0;i<m;i++) {
			if(main.exist(a, b, i)) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
	}
	
	public boolean exist(int[] a, int[] b, int index) {
		int left = 0;
		int right = a.length-1;
		int mid = left + (right-left)/2;
		
		while(left<=right) {
			if(a[mid]==b[index]) {
				return true;
			}
			else {
				if(a[mid]<b[index]) {
					left = mid+1;
				}
				else {
					right = mid-1;
				}
			}
			mid = left + (right-left)/2;
		}
		
		return false;
	}

}