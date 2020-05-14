#include <stdio.h>
void bubblesort(int N[]);

int main() {
	int N[5];
	for (int i = 0; i < 5; i++) {
		scanf_s("%d", &N[5]);
	}
	bubblesort(N);
}

void bubblesort(int N[]) {
	int tmp;
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 4; j++) {
			if (N[j] > N[j + 1]) {
				tmp = N[j];
				N[j] = N[j + 1];
				N[j + 1] = tmp;
				for (int k = 0; k < 5; k++) {
					printf("%d\n", N[k]);
				}
 			}
		}
	}
}