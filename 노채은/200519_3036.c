#include <stdio.h>

int GCD(int a, int b);

int main() {
	int N, ling[101], a, b, gcd, tmpa = 1, tmpb = 1;
	scanf_s("%d", &N);
	for (int i = 0; i < N; i++) {
		scanf_s("%d", &ling[i]);
	}
	for (int j = 0; j < N-1; j++) {
		a = ling[j] * tmpa;
		b = ling[j + 1] * tmpb;
		gcd = GCD(a, b); 
		printf("%d/%d\n", a / gcd, b / gcd);
		tmpa = a / gcd;
		tmpb = b / gcd;

	}
}

int GCD(int a, int b) {
	if (b == 0) {
		return a;
	}
	else {
		return GCD(b, a % b);
	}
}