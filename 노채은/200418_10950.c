#include <stdio.h>

int main() {

	int n = 0;
	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		int a = 0, b = 0;
		scanf("%d %d", &a, &b);
		printf("%d\n", a + b);
	}
	return 0;
}