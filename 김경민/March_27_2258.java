package First_week;

import java.util.Arrays;
import java.util.Scanner;

public class March_27_2258 {

	public static class meet implements Comparable<meet> {
		int weight = 0;
		int price = 0;

		public meet(int weight, int price) {
			setWeight(weight);
			setPrice(price);
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public int compareTo(meet comp) {
			// TODO Auto-generated method stub
			if (comp.price < this.price)
				return 1;
			else if (comp.price > this.price)
				return -1;
			else if (comp.weight > this.weight)
				return 1;
			else if (comp.weight < this.weight)
				return -1;
			else
				return 0;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int i;
		int sum_weight = 0;
		int price = 0;
		boolean stop = false;
		int answer = Integer.MAX_VALUE;
		meet arr[] = new meet[N];
		for (i = 0; i < N; i++) {
			int weight = scan.nextInt();
			price = scan.nextInt();
			arr[i] = new meet(weight, price);
		}
		Arrays.sort(arr);
		for (i = 0; i < N; i++) {
			sum_weight += arr[i].weight;
			if (i > 0 && arr[i - 1].price == arr[i].price)
				price += arr[i].price;
			else
				price = 0;
			if (sum_weight >= M) {
				stop = true;
				answer = Math.min(answer, price + arr[i].price);
			}
		}
		if (stop)
			System.out.println(answer);
		else
			System.out.println(-1);
	}
}
