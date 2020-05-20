#include <stdio.h>

int main() {
	int N, rank = 0;
	int x[50] = { 0, };
	int y[50] = { 0, };

	scanf("%d", &N);

	for (int i = 0; i < N; i++) {
		scanf("%d %d", &x[i], &y[i]);
	}

	for (int i = 0; i < N; i++) {
		rank = 0;
		for (int j = 0; j < N; j++) {
			if (x[i] < x[j] && y[i] < y[j]) {
				rank++;
			}
		}
		printf("%d ", rank+1);
	}
	return 0;
}

//브루트 포스 (조합 가능한 모든 경우의 수를 다 대입해보는 것)