package Baekjoon.solve_15000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Baekjoon16165 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<String,String[]> map = new HashMap<>();
		while(n-- != 0) {
			String s = sc.next();
			int sn = sc.nextInt();
			String[] sa = new String[sn];
			for(int i = 0; i < sn; i++) {
				sa[i] = sc.next();
			}
			Arrays.sort(sa);
			map.put(s, sa);
		}
		
		while(m-- != 0) {
			String s = sc.next();
			int mn = sc.nextInt();
			if(mn == 0) {
				String[] sa = map.get(s);
				for(int i = 0; i < sa.length; i++) {
					System.out.println(sa[i]);
				}
			}else {
				for(String k: map.keySet()) {
					String[] sa = map.get(k);
					boolean t = false;
					for(int i = 0; i < sa.length; i++) {
						if(sa[i].equals(s)) {
							t = !t;
							break;
						}
					}
					if(t) {
						System.out.println(k);
						break;
					}
				}
			}
		}
	}
}
