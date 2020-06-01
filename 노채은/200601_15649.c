#include <stdio.h>

int N, M, arr[9], choose[9];

void seq(int a) {
	if (a == M) {
		for (int i = 0; i < M; i++) {
			printf("%d ", arr[i]);
		}
		printf("\n");
	}
	for (int i = 1; i <= N; i++) {
		if (choose[i] == 0) {
			choose[i] = 1;
			arr[a] = i;
			seq(a + 1);
			choose[i] = 0;
		}
	}
}

int main() {
	scanf("%d %d", &N, &M);
	seq(0);
}