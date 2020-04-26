#include <stdio.h>

int main() {
	int N, fact = 1;
	scanf("%d", &N);
	if (N == 0) {
		printf("1\n");
		return 0;
	}
	for (int i = 1; i < N + 1; i++) {
		fact *= i;
	}
	printf("%d\n", fact);
}