package Baekjoon.Sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Baekjoon2910 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = sc.nextInt();
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(list1.contains(a)) {
				list2.set(list1.indexOf(a), list2.get(list1.indexOf(a))+1);
			}else {
				list1.add(a);
				list2.add(1);
			}
		}
		
		
		for(int i = 0; i < n; i++) {
			int max = 0;
			for(int j = 0; j < list2.size(); j++) {
				if(list2.get(j) > list2.get(max)) {
					max = j;
				}
			}
			for(int j = 0; j < list2.get(max); j++) {
				System.out.print(list1.get(max) + " ");
			}
			list2.set(max, 0);
		}
	}
}
