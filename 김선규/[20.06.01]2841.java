package Baekjoon.solve_02000;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon2841 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> one = new Stack<>();
		Stack<Integer> two = new Stack<>();
		Stack<Integer> three = new Stack<>();
		Stack<Integer> four = new Stack<>();
		Stack<Integer> five = new Stack<>();
		Stack<Integer> six = new Stack<>();
		int n = sc.nextInt();
		int p = sc.nextInt();
		
		int count = 0;
		while(n-->0) {
			int f = sc.nextInt();
			int s = sc.nextInt();
			switch(f) {
			case 1:
				count += finger(one,s);
				break;
			case 2:
				count += finger(two,s);
				break;
			case 3:
				count += finger(three,s);
				break;
			case 4:
				count += finger(four,s);
				break;
			case 5:
				count += finger(five,s);
				break;
			case 6:
				count += finger(six,s);
				break;
			}
		}
		System.out.print(count);
	}
	
	public static int finger(Stack<Integer> st,int num) {
		int count = 0;
		if(st.isEmpty()) {
			st.push(num);
			count++;
		}
		while(!st.peek().equals(num)) {
			if(st.peek() > num) {
				st.pop();
				count++;
			}else if(st.peek() < num){
				st.push(num);
				count++;
			}
			if(st.isEmpty()) {
				st.push(num);
				count++;
			}
		}
		return count;
	}
}
