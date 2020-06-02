#include <stdio.h>

int value[101], process[100001];

void numberOfCases(int n, int k) {
	for (int i = 1; i <= n; i++) {
		for (int j = value[i]; j <= k; j++) {
			process[j] += process[j - value[i]];
		}
	}
}
int main() {
	int n, k;
	scanf("%d %d", &n, &k);
	process[0] = 1;
	for (int i = 1; i <= n; i++) {
		scanf("%d", &value[i]);
	}
	numberOfCases(n, k);
	printf("%d", process[k]);
}