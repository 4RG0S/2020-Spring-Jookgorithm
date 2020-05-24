#include <stdio.h>
#include <stdbool.h>

int T, n, num, Eureka[46];
bool res[1000];

int main() {

	for (int i = 1; i <= 45; i++) {
		Eureka[i] = i * (i + 1) / 2;
	}

	for (int i = 1; i <= 45; i++) {
		for (int j = 1; j <= 45; j++) {
			for (int k = 1; k <= 45; k++) {
				num = Eureka[i] + Eureka[j] + Eureka[k];
				if (num <= 1000) res[num] = 1;
			}
		}
	}
	scanf("%d", &T);

	for (int i = 1; i <= T; i++) {
		scanf("%d", &n);
		printf("%d\n", res[n]);
	}

}

//브루트 포스

