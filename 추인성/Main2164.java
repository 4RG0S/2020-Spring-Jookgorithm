import java.util.LinkedList;
import java.util.Scanner;

public class Main2164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		int n = input.nextInt();
		boolean remove = true;
		
		for(int i=1;i<=n;i++) {
			list.add(i);
		}
		
		while(list.size()>1) {
			if(remove) {
				list.remove();
				remove = false;
			}
			else {
				list.add(list.remove());
				remove = true;
			}
		}
		
		System.out.println(list.remove());
	}

}
