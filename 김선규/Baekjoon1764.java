package Baekjoon.Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1764 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		for(int i = 0; i < n1; i++)
			list1.add(sc.next());
		
		list1.sort(null);
		String[] s = new String[list1.size()];
		s = list1.toArray(s);
		
		for(int i = 0; i < n2; i++) {
			String p = sc.next();
			if(0 <= Arrays.binarySearch(s, p))
				list2.add(p);
		}
		
		list2.sort(null);
		
		System.out.println(list2.size());
		for(int i = 0; i < list2.size(); i++)
			System.out.println(list2.get(i));
	}
}
