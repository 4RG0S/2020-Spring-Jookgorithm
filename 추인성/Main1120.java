import java.util.Scanner;

public class Main1120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String a = input.next();
		String b = input.next();
		int ans = a.length();
		
		for(int i=0;i<=b.length()-a.length();i++) {
			int cnt =0;
			for(int j=0;j<a.length();j++) {
				if(a.charAt(j)!=b.charAt(i+j)) {
					cnt++;
				}
			}
			ans = Math.min(cnt, ans);
		}
		
		System.out.println(ans);
	}

	
}
