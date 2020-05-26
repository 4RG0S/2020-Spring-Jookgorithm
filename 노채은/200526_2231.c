#include <stdio.h>

void divideSum(int);

int main() {
	int N;
	scanf("%d", &N);
	divideSum(N);
}

void divideSum(int N) {
	int i;
	int sum = 0, flag = 0;
	int tmp = N;
	for (i = N - 54; i < N; i++) {
		sum = tmp = i;
		while (tmp > 0) {
			sum += tmp % 10;
			tmp /= 10;
		}
		if (sum == N) {
			flag = 1;
			break;
		}
	}
	flag == 1 ? printf("%d", i) : printf("0");
}
//브루트 포스