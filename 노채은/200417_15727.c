#include <stdio.h>

int main() {
	int L;
	scanf("%d", &L);
	if (L % 5 == 0) {
		printf("%d", L / 5);
	}
	else printf("%d", L / 5 + 1);
	return 0;
}