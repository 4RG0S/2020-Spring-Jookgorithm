#include <stdio.h>

int uclid(int a, int b);

int main() {
	int a, b, n, GCD, LCM;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%d %d", &a, &b);
		GCD = uclid(a, b);
		LCM = GCD * (a / GCD * b / GCD);
		printf("%d\n", LCM);
	}
}

int uclid(int a, int b) {
	if (b == 0) return a;
	else return uclid(b, a % b);
}