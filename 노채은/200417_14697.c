#include <stdio.h>

int main() {
	int n, a, b, c;
	scanf("%d %d %d %d", &a, &b, &c, &n);

	for (int i = 0; i <= n / a; i++) {
		for (int j = 0; j <= n / b; j++) {
			for (int k = 0; k <= n / c; k++) {
				if (i * a + j * b + k * c == n) {
					printf("1");
					return 0;
				}
			}
		}
	}

	printf("0");
	return 0;
}