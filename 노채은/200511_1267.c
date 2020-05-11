#include <stdio.h>
int N, t, Y = 0, M = 0;
int main() {
	scanf("%d", &N);
	for (int i = 0; i < N; i++) {
		scanf("%d", &t);
		Y += 10 * (t / 30 + 1);
		M += 15 * (t / 60 + 1);
	}
	if (M > Y) {
		printf("Y %d", Y);
	}
	else if (M == Y) {
		printf("Y M %d", Y);
	}
	else {
		printf("M %d", M);
	}
	return 0;
}