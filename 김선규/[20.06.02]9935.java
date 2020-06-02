package Baekjoon.solve_05000;

import java.io.*;
import java.util.*;

public class Baekjoon9935 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String word = br.readLine();
        String bomb = br.readLine();
        Stack<Character> st = new Stack<>();
        
		for(int i = 0; i < word.length(); i++) {
			st.push(word.charAt(i));
			if(st.size() >= bomb.length()) {
				boolean ok = true;
				for(int j = 0; j < bomb.length(); j++) {
					if(st.get(st.size()-bomb.length()+j) != bomb.charAt(j)) {
						ok = false;
						break;
					}
				}
				if(ok) {
					for(int j = 0; j < bomb.length(); j++) {
						st.pop();
					}
				}
			}
		}
		
		if(st.isEmpty()) {
			System.out.print("FRULA");
		}else {
			for(int i = 0; i < st.size(); i++) {
				System.out.print(st.get(i));
			}
		}
	}
}
