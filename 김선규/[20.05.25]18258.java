package Baekjoon.solve_15000;

import java.io.*;
import java.util.*;

public class Baekjoon18258 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<>();
		int last = 0;
		while(n-- != 0) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			switch(s) {
			case "push":
				last = Integer.parseInt(st.nextToken());
				q.offer(last);
				break;
			case "pop":
				if(q.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(q.poll()+"\n");
				}
				break;
			case "size":
				bw.write(q.size()+"\n");;
				break;
			case "empty":
				if(q.isEmpty()) {
					bw.write("1\n");;
				}else {
					bw.write("0\n");;
				}
				break;
			case "front":
				if(q.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(q.peek()+"\n");
				}
				break;
			case "back":
				if(q.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(last+"\n");
				}
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
