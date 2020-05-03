#include <stdio.h>
int main() {
	int a[10], cha[42] = { 0 }, num = 0;
	for (int i = 0; i < 10; i++) {
		scanf("%d", &a[i]);
		a[i] %= 42;
	}
	for (int i = 0; i < 10; i++) {
		cha[a[i]]++;

		if (cha[a[i]] == 2) {
			cha[a[i]]--;
		}
	}
	for (int i = 0; i < 42; i++) {
		num = num + cha[i];
	}
	printf("%d", num);

	return 0;
}