package DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		while(t-- != 0) {
			String s = sc.nextLine();
			Stack<Character> st = new Stack<>();
			try {
				for(int i = 0; i < s.length(); i++) {
					if(s.charAt(i) == '(') {
						st.push('(');
					}else {
						st.pop();
					}
				}
			}catch(Exception e) {
				System.out.println("NO");
				continue;
			}
			if(st.isEmpty()) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
