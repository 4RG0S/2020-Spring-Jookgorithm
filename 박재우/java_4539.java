package น้มุ;

import java.util.ArrayList;
import java.util.Scanner;

public class java_4539 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<>();
		int roof = scan.nextInt();
		int temp,count = 0;
		for(int i = 0;i<roof;i++) {
			temp = scan.nextInt();
			if (temp<10)
				ar.add(temp);
			else{
				if (temp > 10) {
					temp = (temp + 5) / 10 * 10;
				}
				if (temp > 100) {
					temp = (temp + 50) / 100 * 100;
				}
				if (temp > 1000) {
					temp = (temp + 500) / 1000 * 1000;
				}
				if (temp > 10000) {
					temp = (temp + 5000) / 10000 * 10000;
				}
				if (temp > 100000) {
					temp = (temp + 50000) / 100000 * 100000;
				}
				if (temp > 1000000) {
					temp = (temp + 500000) / 1000000 * 1000000;
				}
				if (temp > 10000000) {
					temp = (temp + 5000000) / 10000000 * 10000000;
				}
				ar.add(temp);
				}
		}
		for(int j = 0;j<roof;j++) {
			System.out.println(ar.get(j));
		}
	}
}
