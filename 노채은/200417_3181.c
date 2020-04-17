#include <stdio.h>
int main() {
	int A, B, C, N, count[300];
	scanf("%d %d %d", &A, &B, &C);

	count[0] = 1;

	for (int i = 0; i < N; i++) {
		if (count[i] == 1)
			count[i + A] = count[i + B] = count[i + C] = 1;
	}
	printf("%d", count[N]);
	return 0;

}