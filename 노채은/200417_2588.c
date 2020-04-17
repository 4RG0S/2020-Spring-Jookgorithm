#include <stdio.h>

int main() {
	int A = 0, B = 0;

	scanf("%d", &A);
	getchar();
	scanf("%d", &B);

	int ans = A * B;

	while (B != 0) { //3
		printf("%d\n", A * (B % 10));
		B /= 10;
	}

	printf("%d", ans);

	return 0;
}