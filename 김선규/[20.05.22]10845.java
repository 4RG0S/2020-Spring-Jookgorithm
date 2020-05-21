package Baekjoon.solve_10000;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon10845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Queue<Integer> q = new LinkedList<>();
		int last = 0;
		while(n-- != 0) {
			String s = sc.next();
			switch(s) {
			case "push":
				last = sc.nextInt();
				q.offer(last);
				break;
			case "pop":
				if(q.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(q.poll());
				}
				break;
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				if(q.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
			case "front":
				if(q.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(q.peek());
				}
				break;
			case "back":
				if(q.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(last);
				}
				break;
			}
		}
	}
}
