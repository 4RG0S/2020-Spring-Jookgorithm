#include <stdio.h>

int count(int N) {
	int tmp1 = N / 100;
	int tmp2 = (N % 100) / 10;
	int tmp3 = (N % 100) % 10;
	if (tmp3 + tmp1 - 2 * tmp2 == 0) {
		return 1;
	}
	else { 
		return 0; 
	}
}

int main() {
	int N, i;
	scanf("%d", &N);
	if (N < 100) {
		printf("%d", N);
	}
	else {
		int output = 99;
		for (i = 100; i < N + 1; i++) {

			output = output + count(i);
		}
		printf("%d", output);
	}
	return 0;
}