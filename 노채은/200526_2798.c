#include <stdio.h>
#include <stdlib.h>

int main(void) {

	int N, M, maxNum, max, res = 0;
	int* card;

	scanf("%d %d", &N, &M);
	card = (int*)calloc(N, sizeof(int));

	for (int i = 0; i < N; i++) {
		scanf("%d", &card[i]);
	}
	for (int i = 0; i < N; i++) {
		for (int j = i+1; j < N; j++) {
			for (int k = j+1; k < N; k++) {
				maxNum = card[i] + card[j] + card[k];
				if (maxNum > res && maxNum <= M) {
					res = maxNum;
				}
			}
		}
	}
	printf("%d", res);
	free(card);
}
// 브루트 포스